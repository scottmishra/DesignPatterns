package patterns.design.chapter6.commandpattern;

public class StereoOnWithCDCommand implements Command {
	Stereo stereo;
	
	public StereoOnWithCDCommand(Stereo st) {
		stereo =st;
	}
	@Override
	public void execute() {
		stereo.on();
		stereo.setCD();
		stereo.setVolume(8);
	}

	@Override
	public void undo() {
		stereo.setVolume(0);
		stereo.off();
	}

}
