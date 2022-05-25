package lecture.week10.ex04;

public class HiVolCustomer extends Customer{
    long volume;
    final double discount_rate = 0.5;
    boolean isQualified;

    public HiVolCustomer(String company_name) {
        this.user_name = "";
        this.company_name = company_name;
        this.type = "High";
        this.volume = 0;
    }

    /* 프로토타입 패턴! */
    public HiVolCustomer(HiVolCustomer hiVolCustomer) {
        this.user_name = hiVolCustomer.user_name;
        this.company_name = hiVolCustomer.company_name;
        this.type = hiVolCustomer.type;
        this.volume = hiVolCustomer.volume;
    }
    public void calDiscountVolume (int volume) {
        if(volume < 50) {
            volume *= (1+discount_rate);
        }
        else if (volume > 2000) {
            volume *= (1-discount_rate);
        }
    }

}
