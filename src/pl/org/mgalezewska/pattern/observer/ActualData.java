package pl.org.mgalezewska.pattern.observer;

/**
 * User: mgalezewska
 * Date: 2015-02-16
 */
public class ActualData implements Observer, Printer {

    private float temp;

    private float humidity;

    private Entity entity;

    public ActualData(Entity entity) {
        this.entity = entity;
        this.entity.addObserver(this);
    }

    @Override
    public void update(float temp, float humidity) {
        this.temp = temp;
        this.humidity = humidity;
        print();
    }

    @Override
    public void print() {
        System.out.println("Aktualne dane: temperatura " + temp + " C, wilgotność "+ humidity + "%");
    }
}
