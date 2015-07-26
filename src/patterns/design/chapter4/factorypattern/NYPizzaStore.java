package patterns.design.chapter4.factorypattern;

public class NYPizzaStore extends PizzaStore{

	//After the ingredient factory
	protected Pizza createPizza(String item){
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
		if (item.equals("cheese")){
			pizza =  new ChicagoStyleCheesePizza();
		}else if (item.equals("cheese2")) {
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("New York Style Cheese Pizza");
		} else if (item.equals("clam2")) {
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
