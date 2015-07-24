package patterns.design.chapter3.decoratorpattern;

public class Mocha extends CondimentDecorator {
	//Instance variable to hold the beverage we are wrapping
	Beverage beverage;
	
	//Want to be able to pass in the instance variable
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		//Combining the beverage description with the decorator's
		return beverage.getDescription() + ", Mocha";
	}

	@Override
	public double cost() {
		//Combining the beverage cost with the decorator's
		return 0.20 + beverage.cost();
	}

	public Beverage getBeverage() {
		return beverage;
	}

	public void setBeverage(Beverage beverage) {
		this.beverage = beverage;
	}
}
