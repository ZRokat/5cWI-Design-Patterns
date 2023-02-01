package at.ran.Main.Sonnenkollektor;

public class Ladergler implements Observer{


    @Override
    public void inform() {
        System.out.println("Laderegler wurde informiert");
    }
}
