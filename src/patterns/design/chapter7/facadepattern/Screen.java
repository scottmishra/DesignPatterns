package patterns.design.chapter7.facadepattern;

public class Screen {
	public Screen() {
	
	}
	
	public void down(){
		System.out.println("Screen has been lowered");
	}
	
	public void up(){
		System.out.println("Screen has been retracted");
	}
}
