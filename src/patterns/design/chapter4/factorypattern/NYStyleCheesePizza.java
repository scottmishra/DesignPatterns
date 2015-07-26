package patterns.design.chapter4.factorypattern;

public class NYStyleCheesePizza extends Pizza {
	public NYStyleCheesePizza(){
		name = "NY Style Sauce and Cheese PIzza";
		dough = "Thin Crust Dough";
		sauce =  "Marinara Sauce";
		
		toppings.add("Grated Reggiano Cheese");
	}
}
