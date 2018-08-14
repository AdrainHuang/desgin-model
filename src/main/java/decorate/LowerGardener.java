package decorate;

/**
 * Created by AdrainHuang on 2018/3/20.
 */
public class LowerGardener implements Gardener {
	private Flower flower;

	public LowerGardener(Flower flower) {
		this.flower = flower;
	}

	public void clip() {
		System.out.println(flower.getColor());
		System.out.println("普通加工");
	}
}
