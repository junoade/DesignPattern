package lecture.week3.problem09_;

public class SelfDrivingCar {
    Motor motor;
    Steer steer;

    SelfDrivingCar(Motor motor, Steer steer){
        this.motor = motor;
        this.steer = steer;
    }
    SelfDrivingCar(){
        this(new JunhoMotor(), new JunhoSteer());
    }
}
