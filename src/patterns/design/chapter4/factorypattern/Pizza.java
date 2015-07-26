package patterns.design.chapter4.factorypattern;

import java.util.ArrayList;

public abstract class Pizza {
	String name;
	String dough;
	String sauce;
	ArrayList<String> toppings = new ArrayList<String>();
	
	void prepare(){
		System.out.println("Preparing: " + name);
		System.out.println("Tossing dough..");
		System.out.println("Addng sauce...");
		System.out.println("Adding toppings...");
		for(String topping : toppings){
			System.out.println(" " + topping);
		}
	}
	
	void bake(){
		System.out.println("Bake for 25 mins at 350\u00b0");
	}
	
	void cut(){
		System.out.println("Cuttng the pizza into diagonal slices");
	}
	
	void box(){
		System.out.println("Place pizza int official PizzaStore Box");
	}
	
	public String getName(){
		return name;
	}
}
