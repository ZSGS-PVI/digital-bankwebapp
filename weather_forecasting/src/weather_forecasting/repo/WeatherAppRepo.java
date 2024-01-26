package weather_forecasting.repo;

import weather_forecasting.model.WeatherData;
import weather_forecasting.viewmodel.WeatherViewModel;

public class WeatherAppRepo {
	
	public WeatherData getWeatherForLocation(String location) {
		WeatherViewModel viewmodel=new WeatherViewModel();
		viewmodel.fetchWeather(location);
		return viewmodel.getWeatherData();
	}

}
