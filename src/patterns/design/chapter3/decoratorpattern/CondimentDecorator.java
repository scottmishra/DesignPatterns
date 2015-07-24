package patterns.design.chapter3.decoratorpattern;

public abstract class CondimentDecorator extends Beverage {
	//By extending the Beverage class, the decorators can
	//"stand-in" for any beverage we would like to create
	
	//We want the decorators to all reimplement the getDescription 
	//method, this will allow us to build up a description
	public abstract String getDescription();
}
