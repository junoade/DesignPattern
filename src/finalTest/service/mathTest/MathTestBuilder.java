package finalTest.service.mathTest;

import finalTest.service.studentInfo.StudentInfo;

import java.util.ArrayList;

public class MathTestBuilder {
    protected String superId;
    ArrayList<OperatorState> multipleOp; // Operator
    protected int num;
    protected int minRange;
    protected int maxRange;
    protected StudentInfo ref_student; // Student Info

    public MathTestBuilder(String superId){
        this.superId = superId;
        multipleOp = new ArrayList<>();
    }

    public MathTestBuilder setSuperId(String super_id){
        this.superId = super_id;
        return this;
    }

    public MathTestBuilder setOperator(OperatorState op){
        multipleOp.add(op);
        return this;
    }

    public MathTestBuilder setNum(int num){
        this.num = num;
        return this;
    }

    public MathTestBuilder setRange(int minRange, int maxRange){
        this.minRange = minRange;
        this.maxRange = maxRange;
        return this;
    }

    public MathTestBuilder setStudentInfo(StudentInfo ref_student){
        this.ref_student = ref_student;
        return this;
    }

    public ArrayList<MathTest> build(){
        ArrayList<MathTest> mathTests = new ArrayList<>();
        for(OperatorState op : multipleOp){
            mathTests.add(new MathTest(superId, op, num, minRange, maxRange, ref_student));
        }
        return mathTests;
    }
}
