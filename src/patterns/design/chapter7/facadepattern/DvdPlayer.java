package patterns.design.chapter7.facadepattern;

public class DvdPlayer {
	public DvdPlayer() {
	
	}
	
	public void on(){
		System.out.println("dvd Player is on");
	}
	
	public void play(String movie){
		System.out.println("Playing movie," + movie +" enjoy");
	}
	
	public void off(){
		System.out.println("Shutting off dvd player");
	}
}
