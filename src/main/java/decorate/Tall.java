package decorate;

/**
 * Created by AdrainHuang on 2017/5/25.
 */
public class Tall extends GirlDecorator {

	private Girl girl;

	public Tall(Girl girl) {
		this.girl = girl;
	}

	public String getDescription() {
		return girl.getDescription() + "+is very tall";
	}
}
