package patterns.design.chapter7.adapterpattern;

/**
 * The adapter class to go between the Duck interfce and the
 * Turkey Interface
 * @author samishr
 *
 */
public class TurkeyAdapter implements Duck {
	
	Turkey turkey;
	
	//This class acts like the decorator class, in 
	//that it will wrap any of the objects that implement
	//The turkey interface
	public TurkeyAdapter(Turkey turkey) {
		this.turkey = turkey;
	}
	
	//Acts as the translation between the quack and gobble methods
	@Override
	public void quack() {
		turkey.gobble();
	}

	//Sinces the turkey class can't fly as far as a duck, they
	//need to fly multiple times in order to get the same distance
	//This would allow the turkey fly to map to the duck fly distance wise
	@Override
	public void fly() {
		
		for(int i = 0; i < 5; i++)
			turkey.fly();
	}

}
