package pl.org.mgalezewska.pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * User: mgalezewska
 * Date: 2015-02-16
 */
public class WeatherData implements Entity {

    private List<Observer> observers = new ArrayList<>();

    private float temp;

    private float humidity;

    @Override
    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temp, humidity);
        }
    }

    public void setMeasurement(float temp, float humidity) {
        this.temp = temp;
        this.humidity = humidity;
        notifyObservers();
    }
}
