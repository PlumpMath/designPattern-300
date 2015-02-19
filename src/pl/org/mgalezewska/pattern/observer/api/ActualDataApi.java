package pl.org.mgalezewska.pattern.observer.api;

import pl.org.mgalezewska.pattern.observer.Printer;

import java.util.Observable;
import java.util.Observer;

/**
 * User: mgalezewska
 * Date: 2015-02-19
 */
public class ActualDataApi implements Observer, Printer {

    private Observable observable;

    private float temp;

    private float humidity;

    public ActualDataApi(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherDataApi) {
            WeatherDataApi weatherDataApi = (WeatherDataApi)o;
            this.temp = weatherDataApi.getTemp();
            this.humidity = weatherDataApi.getHumidity();
            print();
        }
    }

    @Override
    public void print() {
        System.out.println("temp: " + temp + ", humidity: " + humidity);
    }
}
