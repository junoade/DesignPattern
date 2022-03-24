package lecture.week3.problem09_;

public abstract class Motor implements Movable{
    int speed;
    public void setSpeed(int speed) { this.speed = speed; }
    public abstract int getSpeed();
}
