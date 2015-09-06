package patterns.design.chapter8.templatemethodpattern;

public class Tea1 extends CaffeineBeverage {

	@Override
	void prepareRecipe(){
		boilWater();
		steepTeaBag();
		pourInCup();
		addLemon();
	}

	private void steepTeaBag() {
		System.out.println("Steeping the tea");		
	}

	private void addLemon() {
		System.out.println("Adding Lemon");		
	}
}
