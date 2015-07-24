package patterns.design.chapter2.observerpattern;

public class WeatherModel {
	private float temperature;
	private float humidity;
	private float pressure;
	
	
	public WeatherModel() {
		this.temperature = 0;
		this.humidity = 0;
		this.pressure = 0;
	}
	
	public WeatherModel(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
	}
	
	public float getTemperature() {
		return temperature;
	}
	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}
	public float getHumidity() {
		return humidity;
	}
	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}
	public float getPressure() {
		return pressure;
	}
	public void setPressure(float pressure) {
		this.pressure = pressure;
	}
}
