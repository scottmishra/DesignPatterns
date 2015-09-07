package patterns.design.chapter8.templatemethodpattern;

public abstract class CaffeineBeverageWithHook {
	final void prepareRecipe(){
		boilWater();
		brew();
		if(customerWantsCondiments()){
			addCondiments();
		}
	}
	
	abstract void brew();
	abstract void addCondiments();
	
	public void boilWater(){
		System.out.println("Boiling water");
	}
	
	public void pourInCup(){
		System.out.println("Pouring into cup");
	}
	
	//Defined a e=default implementation of this method
	public boolean customerWantsCondiments(){
		return true;
	}
}
