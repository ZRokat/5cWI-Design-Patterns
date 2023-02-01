package at.ran.Main.Sonnenkollektor;

public class main {
    public static void main(String[] args) {
        Sonnenkollektor s = new Sonnenkollektor(20,"Westen");
        Sonnenkollektor s2 = new Sonnenkollektor(15,"Süden");
        s.addObserver( new Ladergler());
        s.addObserver( new Geschirrspüler());
        s.addObserver( new Heizung());

        s2.addObserver(new Geschirrspüler());

        s.inform();
        s2.inform();
    }
}
