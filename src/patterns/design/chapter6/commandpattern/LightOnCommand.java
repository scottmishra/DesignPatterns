package patterns.design.chapter6.commandpattern;

/**
 * A concrete implementation of the Command interface
 * @author scott
 *
 */
public class LightOnCommand implements Command {
	Light light;

	// Pass in the specific light that we want this command
	//to execute on
	public LightOnCommand(Light light) {
		this.light = light;
	}
	
	@Override
	public void execute() {
		light.on();
	}

}
