package at.ran.Main.Move;

public class MoveHorizontal implements MoveStrategy {
    private float x,y, speed;

    public MoveHorizontal(float x, float y, float speed) {
        this.x = x;
        this.y = y;
        this.speed = speed;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public void update(int delta){
        this.x += delta * speed;
        if (this.x <= 0 || this.x >= 1000 - 200) {
            speed = speed * -1;
        }
    }

}
