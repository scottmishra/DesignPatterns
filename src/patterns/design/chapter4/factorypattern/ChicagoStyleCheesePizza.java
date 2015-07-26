package patterns.design.chapter4.factorypattern;

public class ChicagoStyleCheesePizza extends Pizza {
	public ChicagoStyleCheesePizza() {
		name = "Chicago style deep dish cheese pizza";
		doughString = "Extra thick crust dough";
		sauceString = "Plum tomator sauce";

		toppings.add("Shredded MOzzarella Cheese");
	}

	void cut() {
		System.out.println("Cutting pizza into square slices");
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
