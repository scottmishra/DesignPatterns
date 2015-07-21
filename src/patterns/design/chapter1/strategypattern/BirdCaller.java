package patterns.design.chapter1.strategypattern;

public class BirdCaller {
	QuackBehavior quackBehavior;
	
	public BirdCaller() {
	
	}
	
	public void makeCall(){
		quackBehavior.quack();
	}

	public QuackBehavior getQuackBehavior() {
		return quackBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
}
