package exercice3;


public class MuteQuack implements QuackBehavior
{
    @Override
    public void quack() {
        System.out.println("Sorry buddy. I cannot quack");
    }
}
