package finalTest.proxy;

import finalTest.domain.Member;

import java.io.IOException;

/**
 * Protection Proxy를 적용
 * <p>
 * 2017112095 컴퓨터공학과 최준호
 */
public interface AuthService {
    void join(Member member);

    int login(String id, String pwd);

    void load_data(String id) throws IOException;

    void request() throws IOException;

    void logout();
}
