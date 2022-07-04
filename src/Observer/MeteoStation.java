package Observer;

public class MeteoStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        ShowCurrentConditions showCurrentConditions = new ShowCurrentConditions(weatherData);

        weatherData.setReadings(26.6f,65,1013.1f);
        weatherData.setReadings(27.7f,70,997.0f);
        weatherData.setReadings(25.5f,90,997.0f);
    }
}
