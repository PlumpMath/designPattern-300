package pl.org.mgalezewska.pattern.strategy.duck;

import pl.org.mgalezewska.pattern.strategy.fly.FlyInterface;
import pl.org.mgalezewska.pattern.strategy.quack.QuackInterface;

/**
 * User: mgalezewska
 * Date: 2015-02-01
 */
public abstract class Duck {

    FlyInterface flyInterface;
    QuackInterface quackInterface;

    public abstract void display();

    public void fly() {
        flyInterface.fly();
    }

    public void quack() {
        quackInterface.quack();
    }

    public void swim() {
        System.out.println("Duck swims");
    }

    public void setFlyWay(FlyInterface fly) {
        flyInterface = fly;
    }

    public void setQuackWay(QuackInterface quack) {
        quackInterface = quack;
    }
}
