package pl.org.mgalezewska.pattern.strategy;

import pl.org.mgalezewska.pattern.strategy.duck.Duck;
import pl.org.mgalezewska.pattern.strategy.duck.NewDuck;
import pl.org.mgalezewska.pattern.strategy.duck.RubberDuck;
import pl.org.mgalezewska.pattern.strategy.duck.WildDuck;
import pl.org.mgalezewska.pattern.strategy.fly.NotFly;
import pl.org.mgalezewska.pattern.strategy.quack.NotQuack;

public class StrategyPattern {

    public static void main(String[] args) {

        Duck wildDuck = new WildDuck();
        wildDuck.display();
        wildDuck.quack();
        wildDuck.fly();
        wildDuck.swim();

        Duck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.quack();
        rubberDuck.fly();
        rubberDuck.swim();

        Duck newDuck = new NewDuck();
        newDuck.display();
        newDuck.quack();
        newDuck.setQuackWay(new NotQuack());
        newDuck.quack();
        newDuck.fly();
        newDuck.setFlyWay(new NotFly());
        newDuck.fly();
        newDuck.swim();
    }
}
