package lecture.week9.factory;

public class LGMotor extends Motor {
    protected void moveMotor(Direction direction) {
        System.out.println("move LG Motor " + direction);
    }
}
