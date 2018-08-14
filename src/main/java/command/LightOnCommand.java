package command;

/**
 * Created by AdrainHuang on 2018/7/29.
 *
 * ConcreteCommand
 */
public class LightOnCommand implements Command{
	Light light;

	public LightOnCommand(Light light) {
		this.light = light;
	}

	public void execute() {
		light.on();
	}
}
