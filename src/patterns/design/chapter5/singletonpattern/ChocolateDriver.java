package patterns.design.chapter5.singletonpattern;

public class ChocolateDriver {
	static Chocolateboiler boiler1;
	static Chocolateboiler boiler2;

	public static void main(String[] args) {
		boiler1 = Chocolateboiler.getInstance();
		boiler2 = Chocolateboiler.getInstance();

		boiler1.fill();
		// Wont get a fill message as the other instance
		// has just filled the boiler
		boiler2.fill();
	}
}
