package patterns.design.chapter2.observerpattern;

public interface Subject {
	public void registerObserver(Observer obs);
	public void removeObserver(Observer obs);
	public void notifyObservers();
}
