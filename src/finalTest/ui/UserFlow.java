package finalTest.ui;

import java.io.IOException;

/**
 * 화면단에서 사용자의 유즈케이스 흐름을 명세 - 템플릿 메소드 패턴
 *
 * 2017112095 컴퓨터공학과 최준호
 */
public interface UserFlow {
    default void run() throws IOException {
        join();
        auth();
        request();
        quit();
    }

    void join();
    void auth() throws IOException;
    void request() throws IOException;
    void quit() throws IOException;

}
