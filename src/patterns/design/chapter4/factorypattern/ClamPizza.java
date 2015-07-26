package patterns.design.chapter4.factorypattern;

public class ClamPizza extends Pizza {

	PizzaIngredientFactory ingredientFactory;
	
	//We can pass in the desired IngredientFactory, chicago, ny, california
	//whatever and then this class will prepare their cheese pizzas
	public ClamPizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}
	
	@Override
	void prepare() {
		System.out.println("Preparing " + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();	
		clam = ingredientFactory.createClam();
	}
}
