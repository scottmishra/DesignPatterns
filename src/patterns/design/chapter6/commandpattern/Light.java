package patterns.design.chapter6.commandpattern;

public class Light {
	String location;
	public Light(String loc) {
		location = loc;
	}
	
	public void on(){
		System.out.println(location + " Light is on");
	}
	
	public void off(){
		System.out.println(location + " Light is off");
	}
}
