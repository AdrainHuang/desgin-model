package delegate;

/**
 * Created by AdrainHuang on 2017/12/13.
 */
public class Boss {
	private IExcutor excutor;

	public Boss(IExcutor excutor) {
		this.excutor = excutor;
	}

	public void executeJob(){
		excutor.doingTask();
	}
}
