package lecture.week9.factory;

public class MotorFactory {
    public static Motor createMotor(Vendor vendor){
        if(vendor.equals(Vendor.LG))
            return new LGMotor();
        else if(vendor.equals(Vendor.HYUNDAI))
            return new HyundaiMotor();
        else{
            System.out.println("현재 제공되지 않는 유형의 Motor 입니다.");
            return null;
        }
    }
}
