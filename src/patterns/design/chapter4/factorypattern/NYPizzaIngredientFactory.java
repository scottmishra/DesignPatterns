package patterns.design.chapter4.factorypattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Concrete implementation of the PizzaIngedientFactory interface that
 * can be used to create the ingredients used by a NY Pizza Store
 * @author scott
 *
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new ThinCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new MarinaraSauce();
	}

	@Override
	public Cheese createCheese() {
		return new ReggianoCheese();
	}

	@Override
	public List<Veggies> createVeggies() {
		List<Veggies> veggies = new ArrayList<>();
		veggies.add(new Garlic());
		veggies.add(new Onion());
		veggies.add(new Mushroom());
		veggies.add(new RedPepper());
		return veggies;
	}

	@Override
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	@Override
	public Clams createClam() {
		return new FreshClams();
	}

}
