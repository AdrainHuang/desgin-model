package singleton;

/**
 * 懒汉
 * Created by AdrainHuang on 2017/5/26.
 */
public class LazyWife {

	private static LazyWife lazyWife;

	public static LazyWife getLazyWife(){
		if (lazyWife == null){
			lazyWife = new LazyWife();
		}
		return lazyWife;
	}
}
