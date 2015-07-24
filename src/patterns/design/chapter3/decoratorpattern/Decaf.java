package patterns.design.chapter3.decoratorpattern;

public class Decaf extends Beverage {

	public Decaf() {
		description = "Decaf Coffee";
	}
	
	@Override
	public double cost() {
		return 1.20;
	}

}
