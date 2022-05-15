package lecture.week9.factory;

public class HyundaiMotor extends Motor{
    protected void moveMotor(Direction direction) {
        System.out.println("move Hyundai Motor " + direction);
    }

}
