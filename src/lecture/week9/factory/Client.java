package lecture.week9.factory;

public class Client {
    public static void main(String[] args) {
        Motor lgMotor = new LGMotor();
        ElevatorController controller1 = new ElevatorController(1, lgMotor);
        controller1.gotoFloor(5);
        controller1.gotoFloor(3);

        Motor hyundaiMotor = new HyundaiMotor();
        ElevatorController controller2 = new ElevatorController(1, hyundaiMotor);
        controller2.gotoFloor(4);
        controller2.gotoFloor(6);
    }

}
