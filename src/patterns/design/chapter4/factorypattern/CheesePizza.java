package patterns.design.chapter4.factorypattern;

/**
 * With the new IngredientFacotry, we no longer need individual 
 * Pizza styles, ie NYCheesePizza, ChicagoCheesePizza
 * @author scott
 *
 */
public class CheesePizza extends Pizza {

	PizzaIngredientFactory ingredientFactory;
	
	//We can pass in the desired IngredientFactory, chicago, ny, california
	//whatever and then this class will prepare their cheese pizzas
	public CheesePizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}
	@Override
	void prepare() {
		System.out.println("Preparing " + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();		
	}

}
