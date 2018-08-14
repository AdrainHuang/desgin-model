package command;

/**
 * Created by AdrainHuang on 2018/7/29.
 */
public class RemotreControlTest {

	public static void main(String[] args) {
		SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
		Command command = new LightOnCommand(new Light());
		simpleRemoteControl.setCommand(command);
		simpleRemoteControl.buttonWasPressed();
	}
}
