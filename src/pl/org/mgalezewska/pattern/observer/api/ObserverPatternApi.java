package pl.org.mgalezewska.pattern.observer.api;

/**
 * User: mgalezewska
 * Date: 2015-02-19
 */
public class ObserverPatternApi {

    public static void main(String[] args) {
        WeatherDataApi weatherDataApi = new WeatherDataApi();
        ActualDataApi actualDataApi = new ActualDataApi(weatherDataApi);

        weatherDataApi.setMeasurement(32f, 43f);
    }
}
