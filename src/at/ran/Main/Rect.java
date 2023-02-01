package at.ran.Main;

import at.ran.Main.Move.MoveStrategy;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class Rect implements Actor{

    private float sizeX;
    private float sizeY;

    private MoveStrategy direction;
    public Rect(float sizeX, float sizeY, MoveStrategy direction) {
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        this.direction = direction;
    }

    @Override
    public void render(Graphics graphics) {
        graphics.drawRect(this.direction.getX(),this.direction.getY(),sizeX,sizeY);
    }

    @Override
    public void update(GameContainer gc, int delta) {
        direction.update(delta);
    }
}
