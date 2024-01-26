package weather_forecasting.view;

import java.util.Scanner;

import weather_forecasting.model.WeatherData;
import weather_forecasting.viewmodel.WeatherViewModel;

public class weatherInfo {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		WeatherViewModel weatherViewModel=new WeatherViewModel() ;
		
		System.out.println("Enter the Location:");
		String location=in.nextLine();
		 weatherViewModel.fetchWeather(location);
		 displayWeatherInfo(weatherViewModel);
		
	}
	 public static void displayWeatherInfo(WeatherViewModel weatherViewModel) {
	        WeatherData data = weatherViewModel.getWeatherData();
	        if (data != null) {
	            System.out.println("Weather Information for " + data.getLocation() + ":");
	            System.out.println("Temperature: " + data.getTemperature());
	            System.out.println("Conditions: " + data.getConditions());
	            System.out.println("DateTime: "+data.getDataTime());
	        } else {
	            System.out.println("Weather data not available.");
	        }


}
}
