package pl.org.mgalezewska.pattern.observer.api;

import java.util.Observable;

/**
 * User: mgalezewska
 * Date: 2015-02-19
 */
public class WeatherDataApi extends Observable {

    private float temp;

    private float humidity;

    public WeatherDataApi() {}

    public void measurementSetChange() {
        setChanged();
        notifyObservers();
    }

    public void setMeasurement(float temp, float humidity) {
        this.temp = temp;
        this.humidity = humidity;
        measurementSetChange();
    }

    public float getTemp() {
        return temp;
    }

    public float getHumidity() {
        return humidity;
    }
}
