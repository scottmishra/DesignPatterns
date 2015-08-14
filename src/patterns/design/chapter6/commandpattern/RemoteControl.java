package patterns.design.chapter6.commandpattern;

public class RemoteControl {
	Command[] onCommands;
	Command[] offCommands;
	Command lastCommand;
	final int TOTAL_COMMANDS = 7;
	public RemoteControl() {
		onCommands = new Command[TOTAL_COMMANDS];
		offCommands = new Command[TOTAL_COMMANDS];
		
		Command noCommand = new NoCommand();
		
		for(int i = 0; i < TOTAL_COMMANDS; i++){
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
	}
	
	public void setCommand(int slot, Command onCommand, Command offCommand){
		if(slot > TOTAL_COMMANDS){
			System.out.println("No slot: " + slot + " available");
			return;
		}
		this.onCommands[slot] = onCommand;
		this.offCommands[slot] = offCommand; 
	}
	
	public void onButtonWasPushed(int slot){
		if(slot > TOTAL_COMMANDS){
			System.out.println("No slot: " + slot + " available");
			return;
		}
		lastCommand = onCommands[slot];
		onCommands[slot].execute();
	}
	
	public void offButtonWasPushed(int slot){
		if(slot > TOTAL_COMMANDS){
			System.out.println("No slot: " + slot + " available");
			return;
		}
		lastCommand = offCommands[slot];
		offCommands[slot].execute();
	}
	
	public void undoButtonWasPushed(){
		lastCommand.undo();
	}
	
	public String toString(){
		StringBuffer stringBuff = new StringBuffer();
		for(int i = 0; i < onCommands.length; i++){
			stringBuff.append("[slot " + i + "]" + onCommands[i].getClass().getName()
					+ "    " + offCommands[i].getClass().getName() +"\n");
		}
		return stringBuff.toString();
	}
}
