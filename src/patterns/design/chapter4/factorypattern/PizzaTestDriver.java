package patterns.design.chapter4.factorypattern;

public class PizzaTestDriver {
	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chiStore = new ChicagoPizzaStore();
		
		Pizza ethanPizza = nyStore.orderPizza("cheese");
		System.out.println("Ethan ordered a: " + ethanPizza.getName());
		
		Pizza joelPizza = chiStore.orderPizza("cheese");
		System.out.println("Joel odered a: " + joelPizza.getName());
		
		
	}
}
