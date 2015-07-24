package patterns.design.chapter2.observerpattern;

public class WeatherStation {

	public static void main(String[] args) {
		// Create a concreate Subject
		System.out.println("Starting weather service");
		WeatherData weatherData = new WeatherData();

		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(
				weatherData);
		
		weatherData.setMeasurements(80, 60, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
	}

}
