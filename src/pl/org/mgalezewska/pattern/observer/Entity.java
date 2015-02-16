package pl.org.mgalezewska.pattern.observer;

/**
 * User: mgalezewska
 * Date: 2015-02-16
 */
public interface Entity {

    public void addObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObservers();
}
