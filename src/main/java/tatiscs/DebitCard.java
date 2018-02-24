package tatiscs;

import org.springframework.stereotype.Service;
import tatiscs.tp.Card;

/**
 * Created by AdrainHuang on 2018/1/11.
 */
@Service
public class DebitCard extends Card {
	protected void execTransaction(int cents) {
		System.out.println("当前支付方式是：debit,金额：【"+cents+"】");
	}

	protected String getType() {
		return Constants.DEBIT_CARD;
	}
}
