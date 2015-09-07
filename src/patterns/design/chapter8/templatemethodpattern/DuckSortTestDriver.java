package patterns.design.chapter8.templatemethodpattern;

import java.util.Arrays;

public class DuckSortTestDriver {
	public static void main(String[] args) {
		Duck[] ducks = {
			new Duck("Daffy", 8),
			new Duck("Dewey", 2),
			new Duck("Howard",7),
			new Duck("Louie", 2),
			new Duck("Huey", 2),
			new Duck("Donald",10)
		};
		
		System.out.println("Before sorting");
		display(ducks);
		
		//using the template method pattern with a static method sort
		Arrays.sort(ducks);
		
		System.out.println("After sprting");
		display(ducks);
	}

	private static void display(Duck[] ducks) {
		for(Duck duck : ducks){
			System.out.println(duck.toString());
		}
	}
}
