package patterns.design.chapter2.observerpattern;

public class WeatherData {
	public float temp;
	public float humidity;
	public float pressure;

	public WeatherData() {
		temp = 0;
		humidity = 0;
		pressure = 0;
	}

	public WeatherData(float temp, float humidity, float pressure) {
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
	}
	
	public float getTemp() {
		return temp;
	}

	public void setTemp(float temp) {
		this.temp = temp;
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