package weather_forecasting.model;

public class WeatherData {
	private String location;
	private String temperature;
	private String conditions;
	private String dataTime;
	
	
	
	@Override
	public String toString() {
		return "WeatherData [location=" + location + ", temperature=" + temperature + ", conditions=" + conditions
				+ "]";
	}
	public WeatherData() {
		super();
		this.location = location;
		this.temperature = temperature;
		this.conditions = conditions;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getTemperature() {
		return temperature;
	}
	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}
	public String getConditions() {
		return conditions;
	}
	public void setConditions(String conditions) {
		this.conditions = conditions;
	}
	public String getDataTime() {
		return dataTime;
	}
	public void setDataTime(String dataTime) {
		this.dataTime = dataTime;
	}
	

}
