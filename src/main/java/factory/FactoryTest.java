package factory;

/**
 * Created by AdrainHuang on 2017/5/25.
 */
public class FactoryTest {
	public static void main(String[] args) {
		HumanFactory factory = new HumanFactory();
		Human male = factory.createHuman("male");
		male.eat();
		male.sleep();
		male.beat();
	}
}
