package at.ran.Main.Snoworld;

import org.newdawn.slick.Graphics;

import java.util.Random;

public class Snowflake implements Actor{
    public enum SIZE {BIG, MEDIUM, SMALL};
    private float x,y;
    private int size;
    private int speed;
    private Random random;

    public Snowflake(SIZE size) {
        this.random = new Random();
        if (size == SIZE.BIG){
            this.size = 20;
            this.speed = 5;
        }

        if (size == SIZE.MEDIUM){
            this.size = 15;
            this.speed = 10;
        }

        if (size == SIZE.SMALL){
            this.size = 5;
            this.speed = 15;
        }
    }

    void setRandomPosition(){
        this.x = random.nextInt(800);
        this.y = random.nextInt(600)-600;
    }

    @Override
    public void render(Graphics graphics){ graphics.fillOval(this.x, this.y, this.size, this.size);} {

    }

    @Override
    public void update(int delta) {

        this.y += (float)delta/this.speed;
        if (this.y >= 600){
            setRandomPosition();
        }


    }
}
