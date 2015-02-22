package pl.org.mgalezewska.pattern.decorator;

/**
 * User: mgalezewska
 * Date: 2015-02-22
 */
public class Milk extends Component {

    Drink drink;

    public Milk(Drink drink) {
        this.drink = drink;
    }

    @Override
    public String getDescription() {
        return drink.getDescription() + ", Milk";
    }

    @Override
    public double price() {
        return drink.price() + 0.20;
    }
}
