package patterns.design.chapter7.adapterpattern;

public class MallardDuck implements Duck {

	@Override
	public void quack() {
		System.out.println("Quack Quack");
	}

	@Override
	public void fly() {
		System.out.println("I'm flying");
	}

}
