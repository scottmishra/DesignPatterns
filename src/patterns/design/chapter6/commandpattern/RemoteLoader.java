package patterns.design.chapter6.commandpattern;

public class RemoteLoader {
	public static void main(String[] args) {
		// Create the remote control object
		RemoteControl controller = new RemoteControl();

		Light livingRoomLight = new Light("Living room");
		Light kitchenLight = new Light("Kitchen");

		Stereo livingRoomStereo = new Stereo("Living Room");

		Command livingRoomLightOnCommand = new LightOnCommand(livingRoomLight);
		Command livingRoomLightOffCommand = new LightOffCommand(livingRoomLight);

		Command kitchenLightOnCommand = new LightOnCommand(kitchenLight);
		Command kitchenLightOffCommand = new LightOffCommand(kitchenLight);

		Command stereoOnCommand = new StereoOnCommand(livingRoomStereo);
		Command stereoOffCommand = new StereoOffCommand(livingRoomStereo);
		Command stereoOnWithCD = new StereoOnWithCDCommand(livingRoomStereo);

		controller.setCommand(0, livingRoomLightOnCommand,
				livingRoomLightOffCommand);
		controller.setCommand(1, kitchenLightOnCommand, kitchenLightOffCommand);
		controller.setCommand(2, stereoOnCommand, stereoOffCommand);
		controller.setCommand(3, stereoOnWithCD, stereoOffCommand);

		Command[] doItAllOn = { livingRoomLightOnCommand,
				kitchenLightOnCommand, stereoOnWithCD };
		Command[] doItAllOff = { livingRoomLightOffCommand,
				kitchenLightOffCommand, stereoOffCommand };
		
		MacroCommand letsDOIT = new MacroCommand(doItAllOn);
		MacroCommand weDoneDidIt = new MacroCommand(doItAllOff);
		
		controller.setCommand(4, letsDOIT, weDoneDidIt);
		
		System.out.println(controller);

		for (int i = 0; i < 5; i++) {
			controller.onButtonWasPushed(i);
			controller.offButtonWasPushed(i);
		}
		controller.undoButtonWasPushed();

	}
}
