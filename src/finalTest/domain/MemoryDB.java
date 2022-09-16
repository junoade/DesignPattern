package finalTest.domain;

import finalTest.service.mathTest.MathTest;
import finalTest.service.studentInfo.StudentInfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MemoryDB implements MemberRepository {
    /* Memory 에 가지고 있는 요소들  */
    private static MemoryDB instance;

    ArrayList<Member> memberTable;
    ArrayList<StudentInfo> studentInfoTable;
    ArrayList<MathTest> mathTestTable;

    private MemoryDB() {
        memberTable = new ArrayList<>();
        studentInfoTable = new ArrayList<>();
        mathTestTable = new ArrayList<>();
    }

    public static MemoryDB getInstance() {
        if (instance == null)
            instance = new MemoryDB();
        return instance;
    }

    @Override
    public void insertMember(Member member) {
        memberTable.add(member);
    }

    @Override
    public void insertStudentInfo(StudentInfo studentInfo) {
        studentInfoTable.add(studentInfo);
    }

    @Override
    public void insertMathTest(List<MathTest> mathTests) {
        mathTestTable.addAll(mathTests);
    }

    @Override
    /* 특정 id에 부여된 수학 시험문제 확인*/
    public List<MathTest> findMathTestById(String id) {
        List<MathTest> result = new ArrayList<>();
        for(MathTest test : mathTestTable){
            if(test.getRef_student().getId().equals(id)){
                result.add(test);
            }
        }
        return result;
    }

    @Override
    public Optional<StudentInfo> findStudentInfoById(String id) {
        Optional<StudentInfo> result = null;
        for(StudentInfo studentInfo : studentInfoTable){
            if(studentInfo.getId().equals(id)){
                result = Optional.of(studentInfo);
                break;
            }
        }
        return result;
    }

    @Override
    public Optional<StudentInfo> findStudentInfoBySuperId(String superId) {
        Optional<StudentInfo> result = null;
        for(StudentInfo studentInfo : studentInfoTable){
            if(studentInfo.getSuper_id().equals(superId)){
                result = Optional.of(studentInfo);
                break;
            }
        }
        return result;
    }

    /* 회원 테이브렝 있는 ID라면 */
    @Override
    public Optional<Member> findMemberById(String id) {
        for (Member member : memberTable) {
            if (member.getId().equals(id))
                return Optional.of(member);
        }
        return Optional.empty();
    }

    @Override
    public List<MathTest> findTestsById(String id) {
        ArrayList<MathTest> result = new ArrayList<>();
        for(MathTest related : mathTestTable){
            if(related.getRef_student().getId().equals(id)){
                result.add(related);
            }
        }
        return result;
    }

}
