package factory.gupao.func;

/**
 * Created by AdrainHuang on 2018/3/4.
 */
public class FactoryTest {
	public static void main(String[] args) {
		//增加了要选择了 有可能出错
		Factory factory = new MengniuFactory();
		System.out.println(factory.getMilk().getName());
	}
}
