package adapterPattern;

/**
 * Created by AdrainHuang on 2017/5/25.
 */
public class Home {
	private CnPluginInterface cnPlugin;

	public Home(){}

	public Home(CnPluginInterface cnPlugin) {
		this.cnPlugin = cnPlugin;
	}

	public CnPluginInterface getCnPlugin() {
		return cnPlugin;
	}

	public void setCnPlugin(CnPluginInterface cnPlugin) {
		this.cnPlugin = cnPlugin;
	}

	public void charge(){
		cnPlugin.chargeWith2Pins();
	}
}
