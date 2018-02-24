package adapterPattern;

/**
 * Created by AdrainHuang on 2017/5/25.
 */
public class AdapterTest {
	public static void main(String[] args) {
		EnPluginInterface enPlugin = new EnPlugin();

		Home home = new Home();
		PluginAdapter adapter = new PluginAdapter(enPlugin);
		home.setCnPlugin(adapter);
		home.charge();
	}
}
