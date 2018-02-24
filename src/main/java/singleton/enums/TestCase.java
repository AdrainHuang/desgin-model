package singleton.enums;

/**
 * Created by AdrainHuang on 2017/5/26.
 */
public class TestCase {
	public static void main(String[] args) {
		for(EnumTest e : EnumTest.values()){
			System.out.println(e.toString());
		}
		System.out.println("分割线-----------------");
		EnumTest test = EnumTest.TUE;

		switch (test){
			case MON:
				System.out.println("星期一");break;
			case TUE:
				System.out.println("星期二");break;
			case WED:
				System.out.println("星期三");break;
			case THU:
				System.out.println("星期四");break;
			case FRI:
				System.out.println("星期五");break;
			case SAT:
				System.out.println("星期六");break;
			case SUN:
				System.out.println("星期天");break;
		}
	}
}
