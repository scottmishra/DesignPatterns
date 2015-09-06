package patterns.design.chapter8.templatemethodpattern;

public abstract class CaffeineBeverage {

	abstract void prepareRecipe();
	
	public CaffeineBeverage() {
		super();
	}

	protected void boilWater() {
		System.out.println("Boiling Water");
	
	}

	protected void pourInCup() {
		System.out.println("Pouring into Cup");
	
	}

}