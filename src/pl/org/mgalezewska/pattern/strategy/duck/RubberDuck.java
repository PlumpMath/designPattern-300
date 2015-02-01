package pl.org.mgalezewska.pattern.strategy.duck;


import pl.org.mgalezewska.pattern.strategy.fly.NotFly;
import pl.org.mgalezewska.pattern.strategy.quack.NotQuack;

/**
 * User: mgalezewska
 * Date: 2015-02-01
 */
public class RubberDuck extends Duck {

    public RubberDuck() {
        quackInterface = new NotQuack();
        flyInterface = new NotFly();
    }

    @Override
    public void display() {
        System.out.println("This is a rubber duck");
    }
}
