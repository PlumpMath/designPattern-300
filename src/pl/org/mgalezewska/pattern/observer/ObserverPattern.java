package pl.org.mgalezewska.pattern.observer;

/**
 * User: mgalezewska
 * Date: 2015-02-16
 */
public class ObserverPattern {

    public static void main(String[] arg) {
        //obserwowany
        WeatherData weatherData = new WeatherData();

        //obserwujacy
        ActualData actualData = new ActualData(weatherData);
        HalfData halfData = new HalfData(weatherData);

        weatherData.setMeasurement(32, 43);
        weatherData.setMeasurement(23, 23);
        weatherData.setMeasurement(34, 54);
    }
}
