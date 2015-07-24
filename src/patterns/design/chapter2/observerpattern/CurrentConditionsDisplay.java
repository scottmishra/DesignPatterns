package patterns.design.chapter2.observerpattern;

/**
 * We want to implement the Observer interface so that we
 * can get updates from the Subject classes, ie WeatherData
 * @author samishr
 *
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
	
	private WeatherModel weatherModel;
	//The link the the WeatherData class using the Subject interface
	//allows use to unregister when we want
	private Subject weatherData; 

	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		//Registering with the Subject Class
		weatherData.registerObserver(this);
	}
	
	@Override
	public void display() {
		System.out.println("Current conditions: " + weatherModel.getTemperature()
				+" F degrees and " + weatherModel.getHumidity() + "% humitidy");
	}

	/**
	 * We save the new information when update is called from the Subject class,
	 * and then call the display() from the DisplayElement interface
	 * @param weatherModel
	 */
	@Override
	public void update(WeatherModel weatherModel) {
		this.weatherModel = weatherModel;
		display();
	}

}
