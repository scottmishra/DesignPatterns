package patterns.design.chapter4.factorypattern;

public class ChicagoStyleCheesePizza extends Pizza {
	public ChicagoStyleCheesePizza() {
		name = "Chicago style deep dish cheese pizza";
		dough = "Extra thick crust dough";
		sauce = "Plum tomator sauce";
		
		toppings.add("Shredded MOzzarella Cheese");
	}
	
	void cut(){
		System.out.println("Cutting pizza into square slices");
	}
}
