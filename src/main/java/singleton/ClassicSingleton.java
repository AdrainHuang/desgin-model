package singleton;

/**
 * Created by AdrainHuang on 2017/12/13.
 */
public class ClassicSingleton {
	private static class LazyHolder{
		private static final ClassicSingleton INSTANCE = new ClassicSingleton();
	}

	private ClassicSingleton() {
	}

	public static final ClassicSingleton getInstance(){
		return LazyHolder.INSTANCE;
	}
}
