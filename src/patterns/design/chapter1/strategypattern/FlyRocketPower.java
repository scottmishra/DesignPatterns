package patterns.design.chapter1.strategypattern;

public class FlyRocketPower implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("I'm flying with a Rocket!");
	}

}
