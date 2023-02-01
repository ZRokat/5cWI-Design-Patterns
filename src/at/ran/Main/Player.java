package at.ran.Main;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;

import java.util.ArrayList;
import java.util.List;

public class Player implements Actor{
private float x,y,speed;
private List<Observer> Obs;

    public Player() {
        this.x = 300;
        this.y = 300;
        this.speed = 5f;
        this.Obs = new ArrayList<>();
    }

    public void addObserver(Observer obs){
        this.Obs.add(obs) ;
    }

    @Override
    public void render(Graphics graphics) {
        graphics.fillRect(this.x,this.y,10,10);
    }

    @Override
    public void update(GameContainer gc, int delta) {
        if (gc.getInput().isKeyDown(Input.KEY_A)){
            this.x -= this.speed;
        }
        if (gc.getInput().isKeyDown(Input.KEY_D)){
            this.x += this.speed;
        }
        if (gc.getInput().isKeyDown(Input.KEY_W)){
            this.y -= this.speed;
        }
        if (gc.getInput().isKeyDown(Input.KEY_S)){
            this.y += this.speed;
        }

        if (this.x >= 500){
            for (Observer o: Obs) {
                o.inform();
            }
        }

    }
}
