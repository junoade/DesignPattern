package lecture.week8.proxy;

public class MainClass {
    public static void main(String[] args) {
        boolean isUserLoggedIn = UserManagerService.isUserLoggedIn();
        User user = new UserProxyHandler(isUserLoggedIn).getUser();
        user.checkOut();

    }
}
