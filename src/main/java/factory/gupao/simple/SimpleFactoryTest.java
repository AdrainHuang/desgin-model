package factory.gupao.simple;

import factory.gupao.Telunsu;

/**
 *
 * Created by AdrainHuang on 2018/3/4.
 */
public class SimpleFactoryTest {
	public static void main(String[] args) {
		//这个new 的过程是一个比较复杂的过程
		//有人民币就不需要 自己new了
		System.out.println(new Telunsu().getName());

		SimpleFactory factory = new SimpleFactory();

		System.out.println(factory.getMilk("伊利").getName());
	}
}
