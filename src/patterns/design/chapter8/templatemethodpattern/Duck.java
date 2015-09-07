package patterns.design.chapter8.templatemethodpattern;

public class Duck implements Comparable {
	String name;
	int weight;
	
	
	
	public Duck(String name, int weight) {
		super();
		this.name = name;
		this.weight = weight;
	}

	public String toString(){
		return name + " weighs " + weight;
	}

	@Override
	public int compareTo(Object obj) {
		Duck otherDuck = (Duck)obj;
		if(otherDuck.weight < this.weight){
			return -1;
		}else if(otherDuck.weight > this.weight){
			return 1;
		}else{
			return 0;
		}
	}

}
