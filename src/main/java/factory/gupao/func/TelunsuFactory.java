package factory.gupao.func;

import factory.gupao.Milk;
import factory.gupao.Telunsu;

/**
 * Created by AdrainHuang on 2018/3/4.
 */
public class TelunsuFactory implements Factory {
	public Milk getMilk() {
		return new Telunsu();
	}
}
