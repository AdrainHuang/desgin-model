package factory.self.abs.milk;

import factory.gupao.Milk;

/**
 * Created by AdrainHuang on 2018/3/6.
 */
public abstract class AbstracMilkStoreFactory {
	private String brand;

	protected abstract Milk getMilk();

	public Milk orderMilk(){
		Milk milk = getMilk();
		milk.getName();
		return milk;
	}


}
