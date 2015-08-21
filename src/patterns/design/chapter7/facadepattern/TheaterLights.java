package patterns.design.chapter7.facadepattern;

public class TheaterLights {
	int lighting;
	
	public TheaterLights() {
		lighting = 0;
	}
	
	public void dim(int dimness){
		lighting  = dimness;
		display();
	}

	
	public void on(){
		lighting=8;
		display();
	}
	
	public void off(){
		lighting = 0;
		System.out.println("Lights off");
	}
	
	public void display() {
		System.out.println("Lights set to: " + lighting + "dimness");
	}
	
	
}
