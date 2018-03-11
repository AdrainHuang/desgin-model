package singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by AdrainHuang on 2018/3/7.
 */
public class RegisterMap {

	private static final Map<String,Object> ioc = new ConcurrentHashMap<String, Object>();

	private RegisterMap() {
	}

	public static Object getBean(String name){
		Object o = ioc.get(name);
		if(o != null){
			return o;
		}else {
			try {
				o = ioc.put(name,Class.forName(name).newInstance());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return o;
	}
}
