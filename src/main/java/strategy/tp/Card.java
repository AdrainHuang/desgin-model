package strategy.tp;

import strategy.PayMethod;

import javax.annotation.PostConstruct;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by AdrainHuang on 2018/1/11.
 */
public abstract class Card implements PayMethod {

	private String name;
	private String number;

//	用来记录当前抽象类型的所有支付的渠道
	static Map<String,Card> cardMap = new ConcurrentHashMap<String, Card>();

	@PostConstruct
	public void init(){
		cardMap.put(getType(),this);
	}

	public Card(String name, String number) {
		this.name = name;
		this.number = number;
	}

	public Card() {
	}

	public void pay(int cents) {
		execTransaction(cents);
	}

	protected abstract void execTransaction(int cents);
	protected abstract String getType();//当前支付类型
}
