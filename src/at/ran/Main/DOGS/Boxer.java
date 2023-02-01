package at.ran.Main.DOGS;

public class Boxer extends Dogs {


    public Boxer(String name, BarkStrat bark ) {
        super(name,bark);

    }


    @Override
    public void run() {
        System.out.println("I am a Boxer and my name is " + getName() + "! ");
        getBark().Bark();
    }

}
