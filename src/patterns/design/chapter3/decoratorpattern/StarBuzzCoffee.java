package patterns.design.chapter3.decoratorpattern;

public class StarBuzzCoffee {
	public static void main(String[] args) {
		Beverage beverage = new HouseBlend();
		System.out.println(beverage.getDescription() + " $" + beverage.cost());
		
		//Use the Decorators to wrap the DarkRoad
		Beverage bev2 = new DarkRoast();
		bev2 = new Mocha(bev2);
		bev2 = new Mocha(bev2);
		bev2 = new Whip(bev2);
		
		System.out.println(bev2.getDescription() + " $" + bev2.cost());
	}
}
