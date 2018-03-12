package strategy;

import org.springframework.stereotype.Service;
import strategy.tp.Card;

/**
 * Created by AdrainHuang on 2018/1/11.
 */
@Service
public class CreditCard extends Card {
	protected void execTransaction(int cents) {
		System.out.println("当前支付方式是：credit,金额：【"+cents+"】");
	}

	protected String getType() {
		return Constants.CREDIT_CARD;
	}
}
