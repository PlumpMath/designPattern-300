package pl.org.mgalezewska.pattern.decorator;

/**
 * User: mgalezewska
 * Date: 2015-02-22
 */
public class DecoratorPattern {

    public static void main(String[] arg) {
        Drink drink = new Espresso();
        System.out.println(drink.getDescription() + " " + drink.price() + " zł");

        Drink drink1 = new SpecialCafe();
        drink1 = new Chocolate(drink1);
        drink1 = new Chocolate(drink1);
        drink1 = new Milk(drink1);
        System.out.println(drink1.getDescription() + " " + drink1.price() + " zł");
    }
}
