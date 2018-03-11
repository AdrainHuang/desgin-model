package factory.self;

import org.junit.Ignore;

/**
 * Created by AdrainHuang on 2017/5/25.
 */
public class FactoryTest {

	@Ignore
	public void test1(){
		HumanFactory factory = new HumanFactory();
		Human male = factory.createHuman("male");
		male.eat();
		male.sleep();
		male.beat();
	}

	public void testAbs(){

	}
}
