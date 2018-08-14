package command;

/**
 * Created by AdrainHuang on 2018/7/29.
 * invoker
 */
public class SimpleRemoteControl {
	Command slot;

	public void setCommand(Command command){
		this.slot=command;
	}

	public void buttonWasPressed(){
		slot.execute();
	}
}
