package patterns.design.chapter4.factorypattern;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
	String name;
	// Before Adding Ingredient Classes
	 
	 String doughString;
	 String sauceString;
	 ArrayList<String> toppings = new ArrayList<String>();

	// void prepare(){
	// System.out.println("Preparing: " + name);
	// System.out.println("Tossing dough..");
	// System.out.println("Addng sauce...");
	// System.out.println("Adding toppings...");
	// for(String topping : toppings){
	// System.out.println(" " + topping);
	// }

	// After Ingredient Classes
	Dough dough;
	Sauce sauce;
	List<Veggies> veggies;
	Cheese cheese;
	Pepperoni pepperoni;
	Clams clam;

	// The prepare method is now abstract, so we can
	// collect the ingredients for any kind of pizza using the
	// new ingredient factory
	abstract void prepare();

	//These methods are the same before/after ingredients
	void bake() {
		System.out.println("Bake for 25 mins at 350\u00b0");
	}

	void cut() {
		System.out.println("Cuttng the pizza into diagonal slices");
	}

	void box() {
		System.out.println("Place pizza int official PizzaStore Box");
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String toString(){
		return name;
	}

}
