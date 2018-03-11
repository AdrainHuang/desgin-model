package singleton.lazy;

/**
 * Created by AdrainHuang on 2018/3/7.
 */
public class LazyThree {

	private LazyThree lazyThree;
	//默认使用LazyThree的时候，会先初始化内部类
	//如果没有使用的话，内部类是不加载的
	public static final LazyThree getInstance(){
		return LazyHolder.LAZY;
	}

	private static class LazyHolder{
		private static final LazyThree LAZY = new LazyThree();
	}
}
