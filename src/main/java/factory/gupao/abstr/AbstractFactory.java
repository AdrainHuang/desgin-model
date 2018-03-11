package factory.gupao.abstr;

import factory.gupao.Milk;

/**
 * Created by AdrainHuang on 2018/3/4.
 */
public abstract class AbstractFactory {
	//公共的逻辑
	//方便用于统一管理


	public abstract Milk getMengniu();
	public abstract Milk getYili();
	public abstract Milk getTelunsu();
	public abstract Milk getSanlu();
}
