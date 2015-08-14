package patterns.design.chapter6.commandpattern;

public class Stereo {
	String location;
	
	public Stereo(String location) {
		this.location = location;
	}
	
	public void on(){
		System.out.println(location + "_stereo is on");
	}
	
	public void off(){
		System.out.println(location + "_stereo is off");
	}
	
	public void setCD(){
		System.out.println(location + "_stereo is set for CD input");
	}
	
	public void setRadio(){
		System.out.println(location + "_stereo is set for Radio");
	}
	
	public void setVolume(int volume){
		//code to set the volume
		//valid range is 1-10
		System.out.println(location + "_stereo is set to " + volume);
	}
}
