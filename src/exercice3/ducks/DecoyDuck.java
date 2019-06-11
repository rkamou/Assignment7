package exercice3.ducks;
 
import exercice3.FlyBehavior;
import exercice3.MuteQuack;
import exercice3.QuackBehavior;

public class DecoyDuck extends Duck implements FlyBehavior, QuackBehavior
{
    public DecoyDuck()
    {
        super();
    }
    
    @Override
    public void display() {
        System.out.println("Displaying DecoyDuck");
    }
    
    @Override
    public void quack() {
    	(new MuteQuack()).quack();
    }

}
