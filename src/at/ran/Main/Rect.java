package at.ran.Main;

import at.ran.Main.Move.MoveStrategy;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class Rect implements Actor, Observer{

    private float sizeX;
    private float sizeY;

    private Color color;
    private MoveStrategy direction;
    public Rect(float sizeX, float sizeY, MoveStrategy direction) {
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        this.direction = direction;
        this.color = Color.white;
    }

    @Override
    public void render(Graphics graphics) {
        graphics.setColor(this.color);
        graphics.fillRect(this.direction.getX(),this.direction.getY(),sizeX,sizeY);
        graphics.setColor(Color.white);
    }

    @Override
    public void update(GameContainer gc, int delta) {
        direction.update(delta);
    }

    @Override
    public void inform() {
        this.color = Color.pink;
    }
}
