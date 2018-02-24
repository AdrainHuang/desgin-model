package decorate;

/**
 * Created by AdrainHuang on 2017/5/25.
 */
public class GoldenHair extends GirlDecorator {

	private Girl girl;

	public GoldenHair(Girl girl) {
		this.girl = girl;
	}

	public String getDescription() {
		return girl.getDescription() + "+with golden hair";
	}
}
