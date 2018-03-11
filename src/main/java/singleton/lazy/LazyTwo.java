package singleton.lazy;

/**
 * Created by AdrainHuang on 2018/3/7.
 * 性能差
 */
public class LazyTwo {

	private LazyTwo(){
	}

	private static LazyTwo lazyTwo = null;

	/**
	 * 性能差
	 */
	public static synchronized LazyTwo getInstance(){
		if(lazyTwo == null){
			lazyTwo = new LazyTwo();
		}
		return lazyTwo;
	}
}
