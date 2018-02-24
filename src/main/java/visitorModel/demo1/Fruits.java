package visitorModel.demo1;

/**
 * Created by AdrainHuang on 2017/3/2.
 */
public class Fruits implements IElement{

	private int pricePerKg;
	private int weight;
	private String name;

	public Fruits(int pricePerKg, int weight, String name) {
		super();
		this.pricePerKg = pricePerKg;
		this.weight = weight;
		this.name = name;
	}
	public int getPricePerKg() {
		return pricePerKg;
	}
	public int getWeight() {
		return weight;
	}
	public String getName() {
		return name;
	}

	public int accept(Visitor visitor) {
		return visitor.visit(this);
	}
}
