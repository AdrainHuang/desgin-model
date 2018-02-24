package singleton;

/**
 *
 * Created by AdrainHuang on 2017/5/26.
 */
public class Wife {
	private static class WifeHolder {
		private static final Wife wife = new Wife();
	}

	private Wife(){}

	public static Wife getWife(){
		return WifeHolder.wife;
	}
}
