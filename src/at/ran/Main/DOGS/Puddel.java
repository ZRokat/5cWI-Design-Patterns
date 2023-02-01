package at.ran.Main.DOGS;

public class Puddel extends Dogs{


    public Puddel(String name, BarkStrat bark) {
        super(name, bark);
    }

    @Override
    public void run() {
        System.out.println("I am a Puddel and my name is " + getName() + "! ");
        getBark().Bark();
    }
}
