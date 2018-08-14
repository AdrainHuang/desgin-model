package adapterPattern;

/**
 * Created by AdrainHuang on 2017/5/25.
 */
//国际测试类
public class CnTest {
	public static void main(String[] args) {
		CnPluginInterface cnPlugin = new CnPlugin();

		Home home = new Home(cnPlugin);
		home.charge();
	}
}
