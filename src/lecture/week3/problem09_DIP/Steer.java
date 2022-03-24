package lecture.week3.problem09_DIP;

public abstract class Steer implements Driveable{
    double steerAngle;
    public void setWheelAngle(double wheelAngle) { this.steerAngle = wheelAngle; }
    public abstract double getSteerAngle();
}
