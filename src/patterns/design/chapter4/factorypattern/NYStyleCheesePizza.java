package patterns.design.chapter4.factorypattern;

public class NYStyleCheesePizza extends Pizza {
	public NYStyleCheesePizza() {
		name = "NY Style Sauce and Cheese PIzza";
		doughString = "Thin Crust Dough";
		sauceString = "Marinara Sauce";

		toppings.add("Grated Reggiano Cheese");
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
