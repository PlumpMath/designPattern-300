package pl.org.mgalezewska.pattern.decorator;

/**
 * User: mgalezewska
 * Date: 2015-02-22
 */
public class Espresso extends Drink {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double price() {
        return 1.99;
    }
}
