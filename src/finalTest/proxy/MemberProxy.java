package finalTest.proxy;

import finalTest.domain.Member;
import finalTest.service.command.Command;
import finalTest.service.command.MathTestCommand;
import finalTest.service.command.StudentInfoCommand;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 인가된 Member
 * <p>
 * 2017112095 컴퓨터공학과 최준호
 */
public class MemberProxy implements AuthService {

    private MemberService realMember;
    private BufferedReader br;
    private Command command;
    private String sessionID;
    private String sessionRole;

    public MemberProxy() {
        realMember = new MemberService();
        br = new BufferedReader(new InputStreamReader(System.in));
        sessionID = "";
        sessionRole = "";
    }

    /**
     * 사용자가 처음 접근 권한을 요청하는 경우 (ex. 회원가입)
     */
    @Override
    public void join(Member member) {
        realMember.join(member);
    }

    /**
     * 로그인 결과가 1이면 선생님/학부모
     * 로그인 결과가 2이면 학생
     * 로그인 결과가 0 이면 정상적 로그인 실패
     * 로그인 결과가 -1이면 에러
     */
    @Override
    public int login(String id, String pwd) {
        int result = realMember.login(id, pwd);
        boolean validUser = result > 0;

        if (!(validUser)) {
            System.out.println(">>> 회원정보가 유효하지 않습니다.");
            return 0;
        }

        if (result == 1) {
            sessionRole = "Manager";
            System.out.println(">>> 선생님/학부모 회원");
        } else if (result == 2) {
            sessionRole = "Student";
            System.out.println(">>> 학생 회원");
        }
        sessionID = id;
        return 1;
    }

    @Override
    public void load_data(String id) throws IOException {
        if (sessionRole.equals("Manager"))
            System.out.println("출제한 문제 목록 ");
        else if (sessionRole.equals("Student")) {
            System.out.println("부여받은 수학 문제 목록");
            realMember.load_data(id);
        }
    }

    @Override
    public void request() throws IOException {
        int cmd = 0;
        do {
            if (sessionRole.equals("Manager")) {
                manager_display();
                cmd = Integer.parseInt(br.readLine());
                switch (cmd) {
                    case 1:
                        command = new StudentInfoCommand(this);
                        break;
                    case 2:
                        command = new MathTestCommand(this);
                        break;
                    case 9: // 종료 명령
                        command = null;
                        break;
                }
            } else if (sessionRole.equals("Student")) {
                student_display();
                cmd = Integer.parseInt(br.readLine());
                switch (cmd) {
                    case 1:
                        break;

                    case 9: // 종료 명령
                        command = null;
                        break;
                }
            }
            if (command != null) {
                command.execute(); // 명령 수행
                command.save(); // db에 저장
            }

        } while (cmd != 9);
    }

    @Override
    public void logout() {
        System.out.println("종료합니다.");
    }

    public MemberService getRealMember() {
        return realMember;
    }

    public String getSessionID() {
        return sessionID;
    }

    public String getSessionRole() {
        return sessionRole;
    }

    public void manager_display() {
        System.out.println("1. 자녀/학생 정보 입력하기");
        System.out.println("2. 수학 문제 출제하기");
        System.out.println("9. 종료");
    }

    public void student_display() {
        System.out.println("1. 수학 문제 번호 입력");
        System.out.println("9. 종료");
    }
}
