package exercice3.ducks;

import exercice3.FlyBehavior;
import exercice3.QuackBehavior;

public abstract class Duck implements FlyBehavior,QuackBehavior
{
//    protected final FlyBehavior fb;
//    protected final QuackBehavior qb;
    
    public Duck() {
//        this.fb = fb;
//        this.qb = qb;
    }
    
    public void swim() {
        System.out.println("I am swimming!");
    }
    
    public void fullDisplay() {
        String className = this.getClass().getSimpleName();
        System.out.println("**************************");
        System.out.println(String.format("%s:", className));
        display();
        fly();
        quack();
        swim();
        System.out.println();
        System.out.println();
    }
    
    public abstract void display();
    

}
