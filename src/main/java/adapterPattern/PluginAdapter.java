package adapterPattern;

/**
 * Created by AdrainHuang on 2017/5/25.
 */
public class PluginAdapter implements CnPluginInterface {
	private EnPluginInterface enPlugin;

	public PluginAdapter(EnPluginInterface enPlugin) {
		this.enPlugin = enPlugin;
	}

	public PluginAdapter(){}

	public void chargeWith2Pins() {
		enPlugin.chargeWith3Pins();;
	}
}
