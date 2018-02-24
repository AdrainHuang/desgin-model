package factory;

/**
 * Created by AdrainHuang on 2017/5/25.
 */
public class HumanFactory {

	public Human createHuman(String gender){
		if(gender.equals("male")){
			return new Male();
		}else if(gender.equals("female")){
			return new Female();
		}else {
			System.out.println("请输入正确的类");
			return null;
		}
	}
}
