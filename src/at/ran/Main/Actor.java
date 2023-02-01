package at.ran.Main;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public interface Actor {
    void render(Graphics graphics);

    public void update(GameContainer gc,int delta);
}
