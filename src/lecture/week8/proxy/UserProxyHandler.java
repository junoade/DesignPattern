package lecture.week8.proxy;

public class UserProxyHandler implements UserProxy {
    private User user;

    /* 사용자의 로그인 여부에 따라 엑세스의 범위가 다른 두 인스턴스를 생성하게 됨 */
    UserProxyHandler(boolean isUserLoggedIn){
        if(isUserLoggedIn) {
            user = new AuthorizedUser();
        }else {
            user = new GuestUser();
        }

    }
    @Override
    public User getUser() {
        return user;
    }
}
