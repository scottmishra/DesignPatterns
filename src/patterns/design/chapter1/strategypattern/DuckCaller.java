package patterns.design.chapter1.strategypattern;

public class DuckCaller extends BirdCaller {
	public DuckCaller() {
		quackBehavior = new Quack();
	}
}
