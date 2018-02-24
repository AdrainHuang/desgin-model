package tatiscs.tp;

import tatiscs.PayMethod;

/**
 * Created by AdrainHuang on 2018/1/11.
 */
public class Cash implements PayMethod {
	public void pay(int cents) {
		System.out.println("支付：【："+ cents+"】");
	}
}
