package patterns.design.chapter4.factorypattern;

import java.util.ArrayList;
import java.util.List;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new ThickCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}

	@Override
	public Cheese createCheese() {
		return new MozzarellaCheese();
	}

	@Override
	public List<Veggies> createVeggies() {
		List<Veggies> veggies = new ArrayList<>();
		veggies.add(new Spinach());
		veggies.add(new BlackOlives());
		veggies.add(new EggPlant());
		return veggies;
	}

	@Override
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	@Override
	public Clams createClam() {
		return new FrozeClams();
	}

}
