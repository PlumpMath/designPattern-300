package pl.org.mgalezewska.pattern.decorator;

/**
 * User: mgalezewska
 * Date: 2015-02-22
 */
public class SpecialCafe extends Drink {

    public SpecialCafe() {
        description = "Special Cafe";
    }

    @Override
    public double price() {
        return 2.99;
    }
}
