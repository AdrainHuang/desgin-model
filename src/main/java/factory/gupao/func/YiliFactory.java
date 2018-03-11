package factory.gupao.func;

import factory.gupao.Milk;
import factory.gupao.Yili;

/**
 * Created by AdrainHuang on 2018/3/4.
 */
public class YiliFactory implements Factory {
	public Milk getMilk() {
		return new Yili();
	}
}
