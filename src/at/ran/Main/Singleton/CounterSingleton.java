package at.ran.Main.Singleton;

public class CounterSingleton {

    private static CounterSingleton instance = null;

    private int counter = 0;

    private CounterSingleton(){
    }

    public void increaseCounter(){
        this.counter++;
    }

    public int getCounter(){
        return this.counter;
    }

    public static CounterSingleton getInstance(){
        if (instance == null){
            instance = new CounterSingleton();

        }
            return instance;

    }

}
