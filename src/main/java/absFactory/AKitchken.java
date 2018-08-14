package absFactory;

/**
 * Created by AdrainHuang on 2017/5/25.
 */
public class AKitchken implements KitchFactory{
	public Food getFood() {
		return new Apple();
	}

	public TableWare getTableWare() {
		return new Knife();
	}
}
