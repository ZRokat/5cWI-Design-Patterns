package at.ran.Main;

import at.ran.Main.Move.MoveStrategy;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class Circle implements Actor  {
    private float size;
    private MoveStrategy direction;
    Circle(float x, MoveStrategy direction ){
        this.size = x;
        this.direction = direction;
    }

    @Override
    public void render(Graphics graphics) {
        graphics.drawOval(this.direction.getX(),this.direction.getY(),size,size);
    }

    @Override
    public void update(GameContainer gc, int delta) {

        direction.update(delta);

    }

}
