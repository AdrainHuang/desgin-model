package singleton;

/**
 * Created by AdrainHuang on 2017/5/26.
 */
public class SafeLazyWife {
	//我们需要给实例加一个 volatile 关键字，它的作用就是防止编译器自行优化代码。
	private volatile static SafeLazyWife safeLazyWife;

	private SafeLazyWife(){}

	public static  SafeLazyWife getSafeLazyWife(){
		if(safeLazyWife == null){
			synchronized (SafeLazyWife.class){
				if (safeLazyWife == null){
					safeLazyWife = new SafeLazyWife();
				}
			}
		}
		return safeLazyWife;
	}
}
