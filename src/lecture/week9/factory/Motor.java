package lecture.week9.factory;

public abstract class Motor {
    private MotorStatus motorStatus;

    public Motor() {
        motorStatus = MotorStatus.STOPPED;
    }
    public MotorStatus getMotorStatus() {
        return motorStatus;
    }
    private void setMotorStatus(MotorStatus motorStatus) {
        this.motorStatus = motorStatus;
    }
    public void move(Direction direction) {
        MotorStatus motorStatus = getMotorStatus();
        if (motorStatus == MotorStatus.MOVING)
            return;
        moveMotor(direction);
        setMotorStatus(MotorStatus.MOVING);
    }
    protected abstract void moveMotor(Direction direction);

    public void stop(){
        if(motorStatus == MotorStatus.MOVING)
            motorStatus = MotorStatus.STOPPED;
        System.out.println("Motor is Stopped...");
    }
}
