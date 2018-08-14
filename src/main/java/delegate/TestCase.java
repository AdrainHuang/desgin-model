package delegate;

/**
 * Created by AdrainHuang on 2018/3/20.
 */
public class TestCase {
	public static void main(String[] args) {
		Jd jd = new Jd();
		jd.buy();
		jd.buyGoods(CountryEnum.JPAN);
	}
}
