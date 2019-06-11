package exercice3.ducks;

import exercice3.FlyBehavior;
import exercice3.FlyWithWings;
import exercice3.QuackBehavior;

public class RedHeadDuck extends Duck implements FlyBehavior, QuackBehavior
{
    public RedHeadDuck()
    {
//        super(new FlyWithWings(), new Quack());
    }
    
    @Override
    public void display() {
        System.out.println("Displaying RedHeadDuck");
    }
    
    @Override
    public void fly() {
        (new FlyWithWings()).fly();
    }
}
