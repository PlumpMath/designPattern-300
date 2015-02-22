package pl.org.mgalezewska.pattern.decorator;

/**
 * User: mgalezewska
 * Date: 2015-02-22
 */
public class Chocolate extends Component {

    Drink drink;

    public Chocolate(Drink drink) {
        this.drink = drink;
    }

    @Override
    public String getDescription() {
        return drink.getDescription() + ", Chocolade";
    }

    @Override
    public double price() {
        return drink.price() + 0.20;
    }
}
