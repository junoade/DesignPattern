package lecture.week9.builder;

public class UserBuilderTest {
    public static void main(String[] args) {
        User user = new User.UserBuilder("Junho", "Choi").setAddress("경기도 의정부시").build();
        System.out.println(user.toString());
    }
}
