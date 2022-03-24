package lecture.week3.problem03_SRP_DIP;

public class Fan extends ElectricDevice {
    @Override
    void turnOn() { System.out.println("Fan: Fan turned on..."); }

    @Override
    void turnOff() { System.out.println("Fan: Fan turned off..."); }
}
