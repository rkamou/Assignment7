package exercice3;


public interface FlyBehavior
{
    public default void  fly() {
    	System.out.println("Sorry buddy. I cannot fly");
    }
}
