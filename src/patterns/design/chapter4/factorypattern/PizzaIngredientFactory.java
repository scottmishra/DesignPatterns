package patterns.design.chapter4.factorypattern;

import java.util.List;

public interface PizzaIngredientFactory {
	
	//Define a create method for each type of ingredient in the interface
	//We have classes per ingredient
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public List<Veggies> createVeggies();
	public Pepperoni createPepperoni();
	public Clams createClam();
	
	//NOTE: If we'd had some common "machinery" to implement each instance of
	// the factory, we could have made this an abstract class instead.
}
