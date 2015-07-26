package patterns.design.chapter4.factorypattern;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();
		if (type.equals("cheese")){
			pizza =  new ChicagoStyleCheesePizza();
		}else if (type.equals("cheese2")) {
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("New York Style Cheese Pizza");
		} else if (type.equals("clam2")) {
			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("New York Style Clam Pizza");
			// }else if(item.equals("clam")){
			// return new NYStyleClamPizza();
			// }else if(item.equals("pepperoni")){
			// return new NYStylePepperoniPizza();
		}
		return pizza;
	}

}
