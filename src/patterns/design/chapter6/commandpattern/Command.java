package patterns.design.chapter6.commandpattern;

public interface Command {
	//Want to ensure that all command objects have an execute method
	public void execute();
	//And a way to undo them
	public void undo();
}
