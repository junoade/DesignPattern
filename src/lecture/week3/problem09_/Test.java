package lecture.week3.problem09_;

public class Test {
    public static void main(String[] args){
        SelfDrivingCar junho = new SelfDrivingCar();
        junho.motor.setSpeed(1);
        junho.steer.setWheelAngle(1.0);
        junho.motor.accelerate();
        junho.motor.accelerate();
        junho.motor.accelerate();
        junho.steer.steerLeft();
        junho.steer.getSteerAngle();
        junho.steer.steerLeft();
        junho.steer.getSteerAngle();
    }
}
