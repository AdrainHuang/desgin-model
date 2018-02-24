package visitorModel.demo1;

/**
 * Created by AdrainHuang on 2017/3/2.
 */
public class Book implements IElement {

	private int price;
	private String isbnNumber;
	public Book(int cost, String isbn){
		this.price=cost;
		this.isbnNumber=isbn;
	}
	public int getPrice() {
		return price;
	}
	public String getIsbnNumber() {
		return isbnNumber;
	}

	public int accept(Visitor visitor) {
		return visitor.visit(this);
	}
}
