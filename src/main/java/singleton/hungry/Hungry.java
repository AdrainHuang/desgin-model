package singleton.hungry;

/**
 * Created by AdrainHuang on 2018/3/7.
 */
public class Hungry {

	private Hungry(){}

	/**
	 *类加载顺序
	 *  先静态，后动态
	 * 先属性，后方法
	 * 先上后下
 	 */

	private static final Hungry hungry = new Hungry();

	public static Hungry getInstance(){
		return hungry;
	}

}
