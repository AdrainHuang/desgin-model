package delegate;

/**
 * Created by AdrainHuang on 2017/12/13.
 */
public class TestDelegate {
	public static void main(String[] args) {
		//老板委派员工干事，事由员工做。
		Boss boss = new Boss(new EmployeeA());
		boss.executeJob();
	}
}
