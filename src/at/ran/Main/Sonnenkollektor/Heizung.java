package at.ran.Main.Sonnenkollektor;

public class Heizung implements Observer{

    @Override
    public void inform() {
        System.out.println("Hezung wurde informiert");
    }
}
