package at.ran.Main.Factory;

import at.ran.Main.Actor;
import at.ran.Main.Circle;
import at.ran.Main.Move.MoveHorizontal;
import at.ran.Main.Move.MoveStrategy;
import at.ran.Main.Move.MoveVertical;
import at.ran.Main.Rect;

import java.util.Random;

public class RandomCircleFactory {

    public static Actor getRandomActor(){
        Random random = new Random();
        int number = random.nextInt(3);
        int spawn = 1000;
        MoveStrategy right = new MoveHorizontal(random.nextInt(spawn),random.nextInt(spawn),0.05f);
        MoveStrategy right2 = new MoveHorizontal(random.nextInt(spawn),random.nextInt(spawn),0.005f);
        MoveStrategy left = new MoveHorizontal(random.nextInt(spawn),random.nextInt(spawn),0.03f);
        MoveStrategy down = new MoveVertical(random.nextInt(spawn),random.nextInt(spawn),0.1f);
        MoveStrategy up = new MoveVertical(random.nextInt(spawn),random.nextInt(spawn),0.09f);
        MoveStrategy[] direction = {right,left,down,up , right2};


        if (number==0){
            return new Circle(random.nextInt(100), direction[random.nextInt(4)] );
        }

        if (number==1){
            return new Rect(random.nextInt(100), random.nextInt(100), direction[random.nextInt(4)] );
        }


        return new Circle(40, up );
    }
}
