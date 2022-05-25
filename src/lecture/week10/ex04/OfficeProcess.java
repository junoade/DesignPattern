package lecture.week10.ex04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OfficeProcess {
    private ClientDatabase database;
    private Customer customerPrototype;

    public void doAProcess() throws IOException {
        // 회사 정보 입력
        System.out.println("Enter company name");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String companyname = br.readLine();

        System.out.println("Now the application would collect lots more company information ....\n");
        System.out.println("Please pick a type of customer from one of the following:('medium' will be assumed otherwise)");
        System.out.println("low\nmedium\nhigh");

        String type = br.readLine();

        System.out.println("Client does some work .....\n");
        switch (type) {
            case "high":
                customerPrototype = new HiVolCustomer(companyname);
                break;
            case "medium":
                customerPrototype = new MedVolCustomer(companyname);
                break;
            case "low":
                customerPrototype = new LoVolCustomer(companyname);
                break;
        }
        /* 프로토 타입 적용 예시 */
        database = new ClientDatabase();    // 데이터베이스 생성
        System.out.println("Client calls on the application of Prototype pattern .....");
        System.out.println("Enter customer names or '-quit'");

        while (true) {
            String cmd = br.readLine();
            if (cmd.equals("-quit")) break;
            else {
                Customer c = customerPrototype.clone();
                c.user_name = cmd;    // 이름만 설정
                database.customers.add(c);
                System.out.println("... more interaction to get information about " + c.user_name + "... : Stored in database");
            }
        }
        /* 전체 customer에 대해, */
        System.out.println("The customers entered during this session:");
        for (int i = 0; i < database.customers.size(); i++) {
            System.out.println("Customer " + database.customers.get(i).user_name
                    + ", an employee of " + database.customers.get(i).company_name
                    + ". Spending category: " + database.customers.get(i).type
                    + " volume. Lots more ....");
        }
    }

}
