package patterns.design.chapter5.singletonpattern;

/**
 * We want this boiler class to be singleton, since we only
 * want a single 
 * @author scott
 *
 */
public class Chocolateboiler {
	private boolean empty;
	private boolean boiled;
	private static Chocolateboiler uniqueInstance; 
	
	//This removes all the overhead of the getInstance()
	//private static Chocolateboiler uniqueInstance = new Chocolateboiler();
	//public static Chocolateboiler getInstance(){ return uniqueInstance;}
	
	private Chocolateboiler() {
		empty = true;
		boiled = false;
	}

	//Here we use the synchronized keyword to ensure that we don't get the 
	//race condition that we had in the SimpleSingletonExample.
	//This is still not ideal since really synchronized is only needed through the 
	//first call and then afterwards it is unneeded
	public static synchronized Chocolateboiler getInstance(){
		if(uniqueInstance == null){
			uniqueInstance = new Chocolateboiler();
		}
		return uniqueInstance;
			
	}
	
	//Fill the boiler with milk/chocolate mixture
	public void fill(){
		if(isEmpty()){
			System.out.println("Filling boiler");
			empty = false;
			boiled = false;
		}
	}
	
	public void drain(){
		if(!isEmpty() && isBoiled()){
			//drain the boiled milk and chocolate
			empty = true;
		}
	}
	
	public void boil(){
		if(!isEmpty() && !isBoiled()){
			//bring contents to a boil
			boiled = true;
		}
	}

	private boolean isEmpty() {
		return empty;
	}
	
	public boolean isBoiled(){
		return boiled;
	}
}
