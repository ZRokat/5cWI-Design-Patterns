package at.ran.Main.Sonnenkollektor;

import java.util.ArrayList;
import java.util.List;

public class Sonnenkollektor implements Observer{

    private int voltage;
    private String name;
    private List<Observer> obs;

    public Sonnenkollektor(int voltage, String name) {
        this.voltage = voltage;
        this.obs = new ArrayList<>();
        this.name = name;
    }

    public void addObserver(Observer o) {
        this.obs.add(o);

    }
    @Override
    public void inform() {
        if (voltage >= 18) {
            System.out.println("Die Geräte am Sonnenkollektor " + this.name + " wurden Informiert");
            for (Observer o : obs) {
                o.inform();
            }
        } else {
        System.out.println("Nichts wurder am Sonnenkollektor im "+ this.name+ " Informiert");
        }
    }


}
