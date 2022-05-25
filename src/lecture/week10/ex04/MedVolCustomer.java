package lecture.week10.ex04;

public class MedVolCustomer extends Customer{
    long volume;
    boolean isQualified;

    public MedVolCustomer(String company_name) {
        this.user_name = "";
        this.company_name = company_name;
        this.type = "Medium";
        this.volume = 0L;
    }

    public MedVolCustomer(MedVolCustomer medVolCustomer) {
        this.user_name = medVolCustomer.user_name;
        this.company_name = medVolCustomer.company_name;
        this.type = medVolCustomer.type;
        this.volume = medVolCustomer.volume;
        this.isQualified = medVolCustomer.isQualified;
    }
    public void calDiscountVolume (int volume) {
        // do nothing
    }

}
