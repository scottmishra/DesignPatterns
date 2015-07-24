package patterns.design.chapter2.observerpattern;

import java.util.ArrayList;

public class WeatherData implements Subject{
	
	private ArrayList<Observer> observerList;
	private WeatherModel weatherModel;
	
	public WeatherData() {
		
		observerList = new ArrayList<Observer>();
	}

	/**
	 * Add an observer to the list when it registers
	 * @param obs
	 */
	@Override
	public void registerObserver(Observer obs) {
		observerList.add(obs);
		
	}

	/**
	 * Remove the obs from the list when it un-registers
	 * @param obs
	 */
	@Override
	public void removeObserver(Observer obs) {
		observerList.remove(obs);
				
	}

	@Override
	public void notifyObservers() {
		System.out.println("updating observers");
		for (Observer observer : observerList) {
			observer.update(weatherModel);
		}
		
	}
	
	public void measurementsChanged(){
		notifyObservers();
	}
	
	public void setMeasurements(float temp, float humidity, float press){
		weatherModel = new WeatherModel(temp,humidity,press);
		measurementsChanged();
	}
}