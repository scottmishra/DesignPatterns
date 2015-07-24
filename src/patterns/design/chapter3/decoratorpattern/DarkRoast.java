package patterns.design.chapter3.decoratorpattern;

public class DarkRoast extends Beverage {

	public DarkRoast() {
		description = "Dark Roasted Coffee";
	}
		
	@Override
	public double cost() {
		return 1.89;
	}

}
