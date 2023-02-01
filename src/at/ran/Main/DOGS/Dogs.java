package at.ran.Main.DOGS;

public abstract class Dogs implements Dog   {


    private String name;

    private BarkStrat bark;



    public Dogs(String name, BarkStrat bark) {
        this.name = name;
        this.bark = bark;
    }

    public String getName() {
        return name;
    }

    public BarkStrat getBark() {return bark;}

}
