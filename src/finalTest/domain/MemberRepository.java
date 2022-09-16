package finalTest.domain;

import finalTest.service.mathTest.MathTest;
import finalTest.service.studentInfo.StudentInfo;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {

    void insertMember(Member member);

    void insertStudentInfo(StudentInfo studentInfo);

    void insertMathTest(List<MathTest> mathTests);

    /* 특정 id에 부여된 수학 시험문제 확인*/
    List<MathTest> findMathTestById(String id);

    Optional<StudentInfo> findStudentInfoById(String id);

    Optional<StudentInfo> findStudentInfoBySuperId(String superId);

    Optional<Member> findMemberById(String id);

    List<MathTest> findTestsById(String id);
}
