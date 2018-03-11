package factory.gupao.simple;

import factory.gupao.Mengniu;
import factory.gupao.Milk;
import factory.gupao.Telunsu;
import factory.gupao.Yili;

/**
 * 简单工厂 小作坊
 * Created by AdrainHuang on 2018/3/4.
 */
public class SimpleFactory {

	public Milk getMilk(String name){
		if("特伦苏".equals(name)){
			return new Telunsu();
		}else if("伊利".equals(name)){
			return new Yili();
		}else if("蒙牛".equals(name)){
			return new Mengniu();
		}
		return null;
	}
}
