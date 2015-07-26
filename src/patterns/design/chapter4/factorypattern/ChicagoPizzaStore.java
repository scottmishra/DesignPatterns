package patterns.design.chapter4.factorypattern;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		if(type.equals("cheese")){
			return new ChicagoStyleCheesePizza();
		//}else if(item.equals("veggie")){
		//	return new NYStyleVeggiePizza();
		//}else if(item.equals("clam")){
		//	return new NYStyleClamPizza();
		//}else if(item.equals("pepperoni")){
		//	return new NYStylePepperoniPizza();
		}else return null;
	}

}
