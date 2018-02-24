package visitorModel.demo1;

/**
 * Created by AdrainHuang on 2017/3/2.
 */
public class ConcreateVisitener1 implements Visitor {
	public int visit(Book books) {
		int cost=0;
		//apply 5$ discount if book price is greater than 50
		if(books.getPrice() > 50){
			cost = books.getPrice()-5;
		}else cost = books.getPrice();
		System.out.println("Book ISBN::"+books.getIsbnNumber() + " cost ="+cost);

		return cost;
	}

	public int visit(Fruits fruits) {
		int cost = fruits.getPricePerKg()*fruits.getWeight();
		System.out.println(fruits.getName() + " cost = "+cost);
		return cost;
	}
}
