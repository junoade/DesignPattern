package finalTest.proxy;

import finalTest.domain.Member;
import finalTest.domain.MemberRepository;
import finalTest.domain.MemoryDB;
import finalTest.service.mathTest.MathTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Optional;

/**
 * DB에 연결해야되는 비용이 큰 RealService
 * <p>
 * 2017112095 컴퓨터공학과 최준호
 */
public class MemberService implements AuthService {
    MemberRepository db;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    MemberService() {
        try {
            db = MemoryDB.getInstance();
        } catch (Exception e) {
            System.out.println("ERROR : DB Connecting is failed");
            e.printStackTrace();
        }
    }

    /**
     * 사용자가 회원가입 하는 경우
     */
    @Override
    public void join(Member member) {
        String id = member.getId();

        Optional<Member> temp = db.findMemberById(id);
        if (temp.isEmpty()) {
            db.insertMember(member);
        } else {
            System.out.println("이미 존재하는 회원입니다.");
        }

    }

    @Override
    public int login(String id, String pwd) {
        Optional<Member> temp = db.findMemberById(id);
        if (temp.isPresent() && isMatch(temp.get(), id, pwd)) {
            if (temp.get().getRole().equals("Manager"))
                return 1;
            else
                return 2;
        } else if (temp.isPresent()) {
            return 0;
        } else {
            return -1;
        }
    }

    /* 일단은 부여 받은 수학 문제 목록을 보여주는 것으로. */
    @Override
    public void load_data(String id) throws IOException {
        List<MathTest> result = db.findTestsById(id);
        for(MathTest test : result){
            for(int i = 0; i<test.getNum(); i++) {
                System.out.println((i+1) + "번 / 총 " + test.getNum()+ "문항 "
                        +test);
                calculate(test);
            }
        }
    }

    public void calculate(MathTest test) throws IOException {
        System.out.print("당신의 답 : ");
        int input = Integer.parseInt(br.readLine());
        int answer = test.getOp().getAnswer();
        System.out.print("실제 답 : " + answer);
        if(input == answer)
            System.out.println(" 축하합니다!");
        else
        System.out.println(" 틀렸습니다.");
    }

    @Override
    public void request() {
    }

    @Override
    public void logout() {
        System.out.println("DB 연결 종료");
    }

    public boolean isMatch(Member temp, String id, String pwd) {
        return temp.getId().equals(id) && temp.getPwd().equals(pwd);
    }

    public MemberRepository getDb() {
        return db;
    }
}
