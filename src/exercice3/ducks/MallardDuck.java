package exercice3.ducks;

import exercice3.FlyBehavior;
import exercice3.FlyWithWings;
import exercice3.QuackBehavior;

public class MallardDuck  extends Duck implements FlyBehavior, QuackBehavior
{
    public MallardDuck()
    {
//        super(new FlyWithWings(), new Quack());
    }
    
    @Override
    public void display() {
        System.out.println("Displaying MallardDuck");
    }
    
    @Override
    public void fly() {
        (new FlyWithWings()).fly();
    }
}
