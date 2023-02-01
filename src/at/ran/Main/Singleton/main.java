package at.ran.Main.Singleton;

public class main {
    public static void main(String[] args) {

        CounterSingleton c1 = CounterSingleton.getInstance();
        CounterSingleton c2 = CounterSingleton.getInstance();
        CounterSingleton c3 = CounterSingleton.getInstance();

        c1.increaseCounter();
        c1.increaseCounter();
        c2.increaseCounter();
        c2.increaseCounter();
        System.out.println(c3.getCounter());
        System.out.println(c2.getCounter());
        System.out.println(c1.getCounter());

    }
}
