package patterns.design.chapter6.commandpattern;

/**
 * Create a simple remote control with only one
 * button
 * @author scott
 *
 */
public class SimpleRemoteControl {
	//Command object to hold the device we want to control	
	Command button;
		
	public SimpleRemoteControl() {
		// TODO Auto-generated constructor stub
	}
	
	public void setCommand(Command command){
		button = command;
	}
	
	public void buttonWasPressed(){
		//Since button is a command object, it has 
		//an execute method that will do our
		//desired command
		button.execute();
	}
}
