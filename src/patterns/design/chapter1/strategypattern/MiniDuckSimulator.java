package patterns.design.chapter1.strategypattern;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		//Create  Mallard duck object and show the use of 
		//object with behaviors that are designed towards
		//an interface
		Duck mallard = new MallardDuck();
		mallard.perfomQuack();
		mallard.performFly();
		/*
		 * Showing that the duck class has several "algorithms" which is known
		 * as a composition. Instead of inheriting the behavior, we are 
		 * composing the behavior, with the correct objects.
		 * We want to use composition over inheritance in has-a relations
		 */
		//Using setters to change behavior at run time
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPower());
		model.performFly();
		
		//Brain Power -> implement Duck Caller
		BirdCaller duckCaller = new DuckCaller();
		duckCaller.makeCall();
	}
	
}
