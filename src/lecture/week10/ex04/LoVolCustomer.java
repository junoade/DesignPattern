package lecture.week10.ex04;

public class LoVolCustomer extends Customer{
    long volume;
    long bill_amount;

    public LoVolCustomer(String company_name) {
        this.user_name = "";
        this.company_name = company_name;
        this.type = "Low";
    }

    public LoVolCustomer(LoVolCustomer loVolCustomer) {
        this.user_name = loVolCustomer.user_name;
        this.company_name = loVolCustomer.company_name;
        this.type = loVolCustomer.type;
        this.volume = loVolCustomer.volume;
    }


}
