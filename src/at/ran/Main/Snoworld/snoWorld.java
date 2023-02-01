package at.ran.Main.Snoworld;

import org.newdawn.slick.*;

import java.util.ArrayList;
import java.util.List;

public class snoWorld extends BasicGame {

    private List<Actor> snowflakes;

    public snoWorld(String title) {
        super(title);
    }


    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.snowflakes = new ArrayList<>();
        for (int i = 0; i < 200; i++) {
            this.snowflakes.add(new Snowflake(Snowflake.SIZE.BIG));
            this.snowflakes.add(new Snowflake(Snowflake.SIZE.MEDIUM));
            this.snowflakes.add(new Snowflake(Snowflake.SIZE.SMALL));
        }
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        for (Actor actor: this.snowflakes){
            actor.update(delta);
        }
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        for (Actor actor: this.snowflakes){
            actor.render(graphics);
        }
    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new snoWorld("Snowworld"));
            container.setDisplayMode(800,600,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
