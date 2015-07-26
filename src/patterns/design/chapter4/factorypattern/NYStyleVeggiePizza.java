package patterns.design.chapter4.factorypattern;

public class NYStyleVeggiePizza extends Pizza {
	public NYStyleVeggiePizza() {
		name = "NY Style Sauce and Veggie PIzza";
		dough = "Thin Crust Dough";
		sauce =  "Marinara Sauce";
		
		toppings.add("Veggie Combo ");
	}
}
