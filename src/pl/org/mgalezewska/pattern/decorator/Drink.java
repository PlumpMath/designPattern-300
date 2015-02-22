package pl.org.mgalezewska.pattern.decorator;

/**
 * User: mgalezewska
 * Date: 2015-02-22
 */
public abstract class Drink {

    String description = "a drink";

    public String getDescription() {
        return description;
    }

    public abstract double price();
}
