package weather_forecasting.viewmodel;

import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import weather_forecasting.model.WeatherData;

public class WeatherViewModel {
	
	private static final String jsonData="/weather_forecasting/src/weather_forecasting/repo/weatherData.json";

	private WeatherData weatherData;
	
	public void  fetchWeather(String location) {
		WeatherData fetchedData=fetchDataFromJSON(location);
		setWeatherData(fetchedData);
	}
	
	private WeatherData fetchDataFromJSON(String location) {
		Gson gson=new Gson();
	    JsonArray jsonArray;
		 try (FileReader reader = new FileReader(jsonData)) {
	            JsonParser parser = new JsonParser();
	            jsonArray = parser.parse(reader).getAsJsonArray();

	            for (JsonElement element : jsonArray) {
	                WeatherData data = gson.fromJson(element, WeatherData.class);
	                if (data.getLocation().equalsIgnoreCase(location)) {
	                    return data;
	                }
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	        return createDefaultWeatherData(location);
	    }

	
	public WeatherData createDefaultWeatherData(String location) {
		WeatherData data=new WeatherData();
		data.setLocation(location);
		data.setTemperature("25°C");
		data.setConditions("sunny");
		
		LocalDateTime currentTime=LocalDateTime.now();
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String DateTimeFormatter=currentTime.format(formatter);
		
		data.setDataTime(DateTimeFormatter);
		return data;
	}
	 public void setWeatherData(WeatherData weatherData) {
	        this.weatherData = weatherData;
	    }

	public WeatherData getWeatherData() {
	    return weatherData;
	}

}
