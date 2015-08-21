package patterns.design.chapter7.facadepattern;

public class Amplifier {
	private DvdPlayer dvd;
	private int volume;
	
	public Amplifier() {
		volume = 0;
	}
	
	public void setDvd(DvdPlayer dvd){
		this.dvd = dvd;
	}
	
	public void setVolumne(int vol){
		volume = vol;
		displayVol();
	}
	
	public void on(){
		volume = 5;
		System.out.println("Amp is on");
		displayVol();
	}
	
	public void displayVol(){
		System.out.println("Volumn set to " + volume);
	}
	
	public void off(){
		System.out.println("Amp is off");
	}
	
}
