package patterns.design.chapter8.templatemethodpattern;

public class DrinkDriver {
	public static void main(String[] args) {
		CaffeineBeverage coffee = new Coffee1();
		CaffeineBeverage tea = new Tea1();
		
		System.out.println("Creating coffee");
		coffee.prepareRecipe();
		
		System.out.println("Creating tea");
		tea.prepareRecipe();
	}
}
