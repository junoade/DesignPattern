package finalTest.service.command;

import finalTest.proxy.MemberProxy;
import finalTest.service.studentInfo.StudentInfoBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 커맨드 패턴의 Concrete Command
 * 학생 정보 객체를 생성하고, receiver인 DB에 전달(저장)
 *
 * 2017112095 컴퓨터공학과 최준호
 */
public class StudentInfoCommand implements Command {
    StudentInfoBuilder builder;
    MemberProxy memberProxy;
    BufferedReader br;

    public StudentInfoCommand(MemberProxy memberProxy){
        this.memberProxy = memberProxy;
        builder = new StudentInfoBuilder(memberProxy.getSessionID());
        br = new BufferedReader(new InputStreamReader(System.in));
    }
    /* 선생님/학부모의 명령을 수행 */
    @Override
    public void execute() throws IOException {
        String input="";

        System.out.println("a. 자녀 아이디 입력");
        input = br.readLine();
        builder.setId(input);

        System.out.println("b. 자녀 이름 입력");
        input = br.readLine();
        builder.setName(input);

        while(true) {
            System.out.println("c. 자녀에게 중요한 사람들의 이름을 입력. 알파벳 q를 눌러 입력 종료");
            input = br.readLine();
            if (input.equals("q"))
                break;
            builder.addRelatedNames(input);
        }

        while(true){
            System.out.println("d. 자녀가 관심을 갖고 있는 항목의 이름 입력. 알파벳 q를 눌러 입력 종료");
            input = br.readLine();
            if (input.equals("q"))
                break;
            builder.addInterest(input);
        }
    }

    /* 결과를 DB에 반영 */
    @Override
    public void save() {
        memberProxy.getRealMember().getDb().insertStudentInfo(builder.build());
    }
}
