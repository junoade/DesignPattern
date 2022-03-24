package lecture.week3.problem09_DIP;

public class JunhoSteer extends Steer {
    @Override
    public void steerRight() {
        System.out.println("steering right...");
        this.setWheelAngle(this.steerAngle + 0.1);
    }

    @Override
    public void steerLeft() {
        System.out.println("steering right...");
        this.setWheelAngle(this.steerAngle - 0.1);
    }

    @Override
    public void steerStraight() {
        System.out.println("steering straight...");
        this.setWheelAngle(this.steerAngle * 1);
    }

    @Override
    public double getSteerAngle() {
        System.out.println("Junho Steer's current angle is " + this.steerAngle);
        return this.steerAngle;
    }
}
