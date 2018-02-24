package absFactory;

/**
 * Created by AdrainHuang on 2017/5/25.
 */
public class Foodaholic {
	public void eac(KitchFactory k){
		System.out.println("A foodaholic is eating " + k.getFood().getFoodName()
		+ " with " + k.getTableWare().getToolName());
	}

	public static void main(String[] args) {
		Foodaholic fh = new Foodaholic();
		AKitchken kf = new AKitchken();
		fh.eac(kf);
	}
}
