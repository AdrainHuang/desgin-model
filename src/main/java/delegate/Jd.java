package delegate;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by AdrainHuang on 2018/3/20.
 */
public class Jd implements IBuy{

	private static Map<CountryEnum,IBuy> map = new HashMap<CountryEnum, IBuy>();

	static {
		map.put(CountryEnum.JPAN,new JpaneseStore());
		map.put(CountryEnum.KOREA, new KoreanStore());
	}

	public void buyGoods(CountryEnum country){
		IBuy store = map.get(country);
		if( store !=null){
			store.buy();
		}
	}

	public void buy() {
		System.out.println("京东自营");
	}
}
