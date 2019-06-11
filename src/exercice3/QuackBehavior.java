package exercice3;


public interface QuackBehavior
{
    public default void quack() {
    	System.out.println("Quack Quack");
    }
}
