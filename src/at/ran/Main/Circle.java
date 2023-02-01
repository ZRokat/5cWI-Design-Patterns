package at.ran.Main;

import at.ran.Main.Move.MoveStrategy;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class Circle implements Actor, Observer  {
    private float size;
    private MoveStrategy direction;

    private Color colour;
    public Circle(float x, MoveStrategy direction ){
        this.size = x;
        this.direction = direction;
    }

    @Override
    public void render(Graphics graphics) {
        graphics.setColor(this.colour);
        graphics.fillOval(this.direction.getX(),this.direction.getY(),size,size);
        graphics.setColor(Color.white);

    }

    @Override
    public void update(GameContainer gc, int delta) {

        direction.update(delta);

    }
    @Override
    public void inform() {
        this.colour = Color.red;
    }
}
