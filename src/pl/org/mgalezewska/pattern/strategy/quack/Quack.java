package pl.org.mgalezewska.pattern.strategy.quack;

import pl.org.mgalezewska.pattern.strategy.quack.QuackInterface;

/**
 * User: mgalezewska
 * Date: 2015-02-01
 */
public class Quack implements QuackInterface {

    @Override
    public void quack() {
        System.out.println("This duck can quack.");
    }
}
