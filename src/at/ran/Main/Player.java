package at.ran.Main;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class Player implements Actor{
private float x,y,speed;

    public Player() {
        this.x = 300;
        this.y = 300;
        this.speed = 1f;
    }

    @Override
    public void render(Graphics graphics) {

    }

    @Override
    public void update(GameContainer gc, int delta) {

    }
}
