package lecture.week3.problem09_DIP;

public class JunhoMotor extends Motor{
    @Override
    public int getSpeed() {
        System.out.println("Junho Motor's current speed is " + this.speed);
        return this.speed;
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerating...");
        this.setSpeed(this.getSpeed() * 2);
    }

    @Override
    public void brake() {
        System.out.println("Brake..!");
        this.setSpeed(this.getSpeed() - 10);
    }
}
