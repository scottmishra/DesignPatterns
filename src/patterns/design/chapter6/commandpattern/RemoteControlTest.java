package patterns.design.chapter6.commandpattern;

public class RemoteControlTest {
	public static void main(String[] args) {
		SimpleRemoteControl remote = new SimpleRemoteControl();
		Light light = new Light("Test");
		LightOnCommand lightOn = new LightOnCommand(light);
		
		remote.setCommand(lightOn);
		remote.buttonWasPressed();
	}
}
