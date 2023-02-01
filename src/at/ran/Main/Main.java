package at.ran.Main;

import at.ran.Main.Factory.RandomCircleFactory;
import at.ran.Main.Move.MoveHorizontal;
import at.ran.Main.Move.MoveStrategy;
import at.ran.Main.Move.MoveVertical;
import org.newdawn.slick.*;

import java.util.ArrayList;
import java.util.List;

public class Main extends BasicGame {
    private List<Actor> actors;

    public Main(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        MoveStrategy right = new MoveHorizontal(200, 500, 0.09f);
        MoveStrategy right2 = new MoveHorizontal(200, 500, 0.4f);
        MoveStrategy left = new MoveHorizontal(300, 600, -0.09f);
        MoveStrategy down = new MoveVertical(400,700, 0.09f);
        MoveStrategy up = new MoveVertical(500,100, -0.09f);
        MoveStrategy[] direction = {right,left,down,up , right2};
        this.actors = new ArrayList<>();
    int x = 0;
        for (int i = 0; i < 10; i++) {
            this.actors.add(RandomCircleFactory.getRandomActor());
            x++;
        }
        Player p = new Player();
        Circle c = new Circle(60, up );
        Circle c2 = new Circle(20, down );
        Rect r = new Rect(100,150,left);

        this.actors.add(p );
        this.actors.add(c );
        this.actors.add(c2 );
        this.actors.add(r );
        p.addObserver(c);
        p.addObserver(c2);
        p.addObserver(c2);
        p.addObserver(r);
    }

    @Override
    public void update(GameContainer gameContainer, int i) throws SlickException {
        for(Actor actor : this.actors) {
            actor.update(gameContainer, i);
        }
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
    for(Actor actor : this.actors) {
        actor.render(graphics);
    }
    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new Main("Interface"));
            container.setDisplayMode(1000,1000,false);
            container.setVSync(true);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
