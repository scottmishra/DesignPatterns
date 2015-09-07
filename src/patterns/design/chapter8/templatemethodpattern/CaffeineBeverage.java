package patterns.design.chapter8.templatemethodpattern;

public abstract class CaffeineBeverage {

	//This is essentially the template method pattern
	public final void prepareRecipe(){
		boilWater();
		brew();
		pourInCup();
		addCondiments();
	}
	
	//portion of the algo that is different between the 
	//different sub classes
	public abstract void brew();
	public abstract void addCondiments();
	
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