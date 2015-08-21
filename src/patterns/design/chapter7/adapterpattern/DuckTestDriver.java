package patterns.design.chapter7.adapterpattern;

public class DuckTestDriver {
	public static void main(String[] args) {
		MallardDuck duck = new MallardDuck();
		
		WildTurkey turkey = new WildTurkey();
		//Adapt the turky to be able to use the duck interface
		Duck adaptedTurkey = new TurkeyAdapter(turkey);
		
		System.out.println("The turkey says....");
		turkey.gobble();
		turkey.fly();
		
		System.out.println("The duck says...");
		duck.quack();
		duck.fly();
		
		System.out.println("The adapted turkey says..");
		adaptedTurkey.quack();
		adaptedTurkey.fly();
	}
}
