package lecture.week8.proxy;

/**
 * User를 관리하는 서비스를 제공하는 클래스,
 * 별도로 요구 명세가 없어,
 * 랜덤한 확률로 user의 로그인 여부를 반환하도록 함.
 */
public class UserManagerService {


    public static boolean isUserLoggedIn(){
        return !(Math.random() >= 0.5);
    }
}
