package patterns.design.chapter6.commandpattern;


/**
 * A class that will allow us to be able 
 * @author scott
 *
 */
public class MacroCommand implements Command {
	Command[] commands;
	
	public MacroCommand(Command[] commands) {
		this.commands = commands;
	}	
	
	@Override
	public void execute() {
		for(Command command : commands){
			command.execute();
		}
	}

	@Override
	public void undo() {
		for(Command command : commands){
			command.undo();
		}
	}

}
