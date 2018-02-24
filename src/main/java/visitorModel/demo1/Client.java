package visitorModel.demo1;

/**
 * Created by AdrainHuang on 2017/3/2.
 */
public class Client {
	public static void main(String[] args) {
		IElement[] items = new IElement[]{new Book(20, "1234"),
				new Book(100, "5678"), new Fruits(10, 2, "Banana"),
				new Fruits(5, 5, "Apple")};
		int total = calculatePrice(items);
		System.out.println("Total Cost = " + total);
	}

	private static int calculatePrice(IElement[] items) {
		ConcreateVisitener1 visitor = new ConcreateVisitener1();
		int sum = 0;
		for (IElement item : items) {
			sum = sum + item.accept(visitor);
		}
		return sum;
	}
}
