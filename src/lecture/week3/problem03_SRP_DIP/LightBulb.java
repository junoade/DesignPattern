package lecture.week3.problem03_SRP_DIP;

public class LightBulb extends ElectricDevice{
    @Override
    void turnOn() { System.out.println("LightBulb: Bulb turned on..."); }

    @Override
    void turnOff() { System.out.println("LightBulb: Bulb turned off..."); }
}
