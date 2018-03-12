package strategy.test;

/**
 * Created by AdrainHuang on 2018/1/11.
 */
public class App {
	public static void main(String[] args) {
		Container container = new Container(new Cat(),new Dog());
		Cat animal = container.init();
		Cat s = new Cat("s");

	}
}
