package at.ran.Main.Move;

public interface MoveStrategy {
    public float getX();
    public float getY();
    public void update(int delta);

}
