package finalTest.service.command;

import finalTest.proxy.MemberProxy;
import finalTest.service.mathTest.*;
import finalTest.service.studentInfo.StudentInfo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Optional;

/**
 * 커맨드 패턴의 Concrete Command
 * 수학 시험지 객체를 생성하고, receiver인 DB에 전달(저장)
 *
 * 2017112095 컴퓨터공학과 최준호
 */
public class MathTestCommand implements Command {
    MathTestBuilder builder;
    MemberProxy memberProxy;
    BufferedReader br;

    public MathTestCommand(MemberProxy memberProxy){
        builder = new MathTestBuilder(memberProxy.getSessionID());
        builder.setSuperId(memberProxy.getSessionID());
        Optional<StudentInfo> temp = memberProxy.getRealMember().getDb().findStudentInfoBySuperId(memberProxy.getSessionID());
        temp.ifPresent(studentInfo -> builder.setStudentInfo(studentInfo));
        this.memberProxy = memberProxy;
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    /* 선생님/학부모의 명령을 수행 */
    @Override
    public void execute() throws IOException {
        char op;
        String input = "";
        OperatorState opState = null;
        while(true) {
            System.out.println("a. 연산의 종류 지정 : {+, -, *, /} 알파벳 q를 눌러 입력 종료");
            op = br.readLine().charAt(0);
            if (op == 'q')
                break;

            switch(op){
                case '+':
                    opState = new Addition();
                    break;
                case '-':
                    opState = new Minus();
                    break;
                case '*':
                    opState = new Multiply();
                    break;
                case '/':
                    opState = new Division();
                    break;
            }
            builder.setOperator(opState);
        }
        System.out.println("b. 생성할 문제의 수");
        int num = Integer.parseInt(br.readLine());
        builder.setNum(num);
        System.out.println("c. 피연산자의 범위 입력 - 예시) 최솟값,최댓값");
        String[] temp = br.readLine().split(",");
        int min = Integer.parseInt(temp[0]);
        int max = Integer.parseInt(temp[1]);
        builder.setRange(min, max);
    }

    /* 선생님/학부모의 명령을 수행 */
    @Override
    public void save() {
        memberProxy.getRealMember().getDb().insertMathTest(builder.build());
    }
}
