package factory.gupao.func;

import factory.gupao.Mengniu;
import factory.gupao.Milk;

/**
 * Created by AdrainHuang on 2018/3/4.
 */
public class MengniuFactory implements Factory {
	public Milk getMilk() {
		return new Mengniu();
	}
}
