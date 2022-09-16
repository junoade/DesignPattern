package finalTest.ui;

import finalTest.domain.Member;
import finalTest.proxy.AuthService;
import finalTest.proxy.MemberProxy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 사용자에게 접해지는 메인 화면
 * 확장시, 각 템플릿 메소드에 대해 버튼 Event를 호출하는 로직을 추가
 *
 * 2017112095 컴퓨터공학과 최준호
 */
public class TestUI implements UserFlow {
    BufferedReader br;
    AuthService authService;

    public TestUI() {
        br = new BufferedReader(new InputStreamReader(System.in));
        authService = new MemberProxy();
    }

    @Override
    public void run() throws IOException {
        UserFlow.super.run();
    }

    /**
     * 테스트를 위해, 교사/학부모 객체, 학생 객체 등을 미리 생성하는 부분
     */
    @Override
    public void join() {
        Member tempTeacher = new Member("ab00", "1234", "최선생님", "Manager");
        authService.join(tempTeacher);
        System.out.println("테스트 관리자 : " + tempTeacher.getName() + " 회원 가입 완료");
        Member tempStudent = new Member("ab01", "1234", "최준호", "Student");
        authService.join(tempStudent);
        System.out.println("테스트 학생 : " + tempStudent.getName() + " 회원 가입 완료");
    }

    /**
     * Protection Proxy 패턴을 적용하여
     * 사용자{선생님 && 학부모 또는 학생} 간 접근할 수 있는 범위를 다르게
     */
    @Override
    public void auth() throws IOException {
        System.out.println(">>> 로그인 정보입력");
        String id = "";
        int authCount = 0;
        while (true) {
            System.out.print("아이디 : ");
            id = br.readLine();
            System.out.print("비밀번호 : ");
            String pwd = br.readLine();

            if (authService.login(id, pwd) > 0) {
                System.out.println(">>> 로그인 성공");
                break;
            } else {
                authCount++;
                System.out.println(">>> 아이디/비밀번호를 다시 확인하세요. 시도 횟수 " + authCount + " / 5");
                if (authCount > 4) {
                    throw new IllegalAccessError("잇다른 실패로 시스템을 종료합니다.");
                }

            }
        }
        System.out.println(">>> 회원정보 불러오는 중...");
        authService.load_data(id);
    }

    @Override
    public void request() throws IOException {
        System.out.println("작업 번호를 입력하세요");
        authService.request();
    }

    @Override
    public void quit() throws IOException {
        System.out.println(">>> 로그아웃 합니다");
        run();
    }
}
