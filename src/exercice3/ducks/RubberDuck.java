package exercice3.ducks;
 
import exercice3.FlyBehavior;
import exercice3.FlyWithWings;
import exercice3.MuteQuack;
import exercice3.QuackBehavior;
import exercice3.Squeak;

public class RubberDuck extends Duck implements FlyBehavior, QuackBehavior
{
    public RubberDuck()
    {
//        super(new CannotFly(), new Squeak());
    }
    
    @Override
    public void display() {
        System.out.println("Displaying RubberDuck");
    }
    
    @Override
    public void fly() {
        (new FlyWithWings()).fly();
    }
    
    @Override
    public void quack() {
    	(new Squeak()).quack();
    }
}
