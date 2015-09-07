package patterns.design.chapter8.templatemethodpattern;

public class Tea1 extends CaffeineBeverage {

	
	//Chaning the base class to use final instead of abstract
	//since the prepareRecipe is the same method calls, just different 
	//implmentationss
//	@Override
//	void prepareRecipe(){
//		boilWater();
//		steepTeaBag();
//		pourInCup();
//		addLemon();
//	}

	private void steepTeaBag() {
		System.out.println("Steeping the tea");		
	}

	private void addLemon() {
		System.out.println("Adding Lemon");		
	}

	@Override
	public void brew() {
		steepTeaBag();
	}

	@Override
	public void addCondiments() {
		addLemon();
	}
}
