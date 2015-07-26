package patterns.design.chapter5.singletonpattern;

public class SimpleSingletonExample {
	//A static variable to hold out one instance of the class
	private static SimpleSingletonExample uniqueInstance;
	
	//A private constructor that can only be called 
	//from within THIS class
	private SimpleSingletonExample(){
		//stuff
	}
	
	//This method gives us a controlled way to
	//instantiate this class -> we can only ever instantiate
	//A single object of this class
	public static SimpleSingletonExample getInstance(){
		if(uniqueInstance == null){
			//Lazy instantiation, this is fine for single threaded
			//apps, but not good for multi-threaded apps
			uniqueInstance = new SimpleSingletonExample();
		}
		return uniqueInstance;
	}

}
