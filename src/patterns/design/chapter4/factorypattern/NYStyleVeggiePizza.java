package patterns.design.chapter4.factorypattern;

public class NYStyleVeggiePizza extends Pizza {
	public NYStyleVeggiePizza() {
		name = "NY Style Sauce and Veggie PIzza";
		doughString = "Thin Crust Dough";
		sauceString =  "Marinara Sauce";
		toppings.add("Veggie Combo ");
	}
	
	@Override
	void prepare() {
		System.out.println("Preparing: " + name);
		System.out.println("Tossing dough..");
		System.out.println("Addng sauce...");
		System.out.println("Adding toppings...");
		for (String topping : toppings) {
			System.out.println(" " + topping);
		}

	}
}
