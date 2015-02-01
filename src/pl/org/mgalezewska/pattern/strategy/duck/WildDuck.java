package pl.org.mgalezewska.pattern.strategy.duck;


import pl.org.mgalezewska.pattern.strategy.fly.Fly;
import pl.org.mgalezewska.pattern.strategy.quack.Quack;

/**
 * User: mgalezewska
 * Date: 2015-02-01
 */
public class WildDuck extends Duck {

    public WildDuck() {
        quackInterface = new Quack();
        flyInterface = new Fly();
    }

    @Override
    public void display() {
        System.out.println("This is a wild duck.");
    }
}
