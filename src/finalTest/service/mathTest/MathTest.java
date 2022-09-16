package finalTest.service.mathTest;

import finalTest.service.studentInfo.StudentInfo;

public class MathTest {
    private String superId;       //supervisor's id
    private OperatorState op;     // Operator
    private int num;
    private int minRange;
    private int maxRange;
    private StudentInfo ref_student;     // Student Info

    /* 복수개의 MathTest가 생성될 수 있기 때문에 */
    public MathTest(String superId, OperatorState op, int num, int minRange, int maxRange, StudentInfo ref_student) {
        this.superId = superId;
        this.op = op;
        this.num = num;
        this.minRange = minRange;
        this.maxRange = maxRange;
        this.ref_student = ref_student;
    }

    public void setOp(OperatorState op) {
        this.op = op;
    }

    public void setMinRange(int minRange) {
        this.minRange = minRange;
    }

    public void setMaxRange(int maxRange) {
        this.maxRange = maxRange;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setRef_student(StudentInfo ref_student) {
        this.ref_student = ref_student;
    }

    public OperatorState getOp() {
        return op;
    }

    public int getMinRange() {
        return minRange;
    }

    public int getMaxRange() {
        return maxRange;
    }

    public int getNum() {
        return num;
    }

    public StudentInfo getRef_student() {
        return ref_student;
    }

    @Override
    public String toString() {
        return "출제자 아이디: " + superId + "\n문제 내용 : \n" + op.getStatement(this);
    }
}
