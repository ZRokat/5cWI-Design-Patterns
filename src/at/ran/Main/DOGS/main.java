package at.ran.Main.DOGS;

import at.ran.Main.Actor;

import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args) {

        List<Dogs> dogs = new ArrayList<>();
        BarkStrat bark = new Wuuf();
        BarkStrat bark1 = new RockRuff();

        dogs.add(new Boxer("Mike", bark ));
        dogs.add(new Boxer("Tyson", bark1 ));
        dogs.add(new Puddel("Clara",bark1));

        for (Dogs d: dogs ) {
            d.run();
        }
    }
}
