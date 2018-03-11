package singleton.lazy;

/**
 * Created by AdrainHuang on 2018/3/7.
 */
public class LazyOne {

	private LazyOne(){
	}

	private static LazyOne lazyOne = null;

	/**
	 * 线程不安全
	 * @return
	 */
	public static LazyOne getInstance(){
		if(lazyOne == null){
			lazyOne = new LazyOne();
		}
		return lazyOne;
	}
}
