package exercice3.driver;

import java.util.Arrays;
import java.util.List;

import exercice3.ducks.DecoyDuck;
import exercice3.ducks.Duck;
import exercice3.ducks.MallardDuck;
import exercice3.ducks.RedHeadDuck;
import exercice3.ducks.RubberDuck;

public class Main
{
    public static void main(String[] args) {
        List<Duck> ducks = Arrays.asList(new MallardDuck(), new DecoyDuck(), new RedHeadDuck(), new RubberDuck());
        ducks.forEach(duck->duck.fullDisplay());
    }
}
