package lecture.week3.problem03_SRP_DIP;

public class ElectricPowerSwitch {

    public ElectricDevice device;

    public boolean on;

    public ElectricPowerSwitch(ElectricDevice device) {
        this.device = device;
        this.on = false;
    }

    public boolean isOn() { return this.on; }

    public void press() {
        boolean checkOn = isOn();
        if (checkOn) {
            device.turnOff();
            this.on = false;
        } else {
            device.turnOn();
            this.on = true;
        }
    }
}

