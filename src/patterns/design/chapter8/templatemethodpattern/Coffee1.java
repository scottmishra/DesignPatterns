package patterns.design.chapter8.templatemethodpattern;

public class Coffee1 extends CaffeineBeverage{
	
//	@Override
//	void prepareRecipe(){
//		boilWater();
//		brewCoffeeGrinds();
//		pourInCup();
//		addSugarAndMilk();
//	}

	//Each of the following methods implments a part of an alogrithm
	private void addSugarAndMilk() {
		System.out.println("Adding sugar and Milk");
	}

	private void brewCoffeeGrinds() {
		System.out.println("Dipping Coffee through filter");
	}

	//forcing the brew method to be overrode
	@Override
	public void brew() {
		System.out.println("Dipping Coffee through filter");
	}

	@Override
	public void addCondiments() {
		addSugarAndMilk();
	}
}
