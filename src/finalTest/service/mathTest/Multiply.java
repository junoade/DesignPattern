package finalTest.service.mathTest;

import finalTest.service.studentInfo.StudentInfo;

public class Multiply implements OperatorState{

    private String target_a;
    private String interest;
    private int x;
    private int y;

    @Override
    public String getStatement(MathTest mathTest) {

        StringBuffer sb = new StringBuffer();
        StudentInfo temp = mathTest.getRef_student();
        target_a = RandomGenerator.randomExtract(temp.getRelatedNames());
        interest = RandomGenerator.randomExtract(temp.getInterests());
        x = RandomGenerator.randomInteger(mathTest.getMinRange(), mathTest.getMaxRange());
        y = RandomGenerator.randomInteger(mathTest.getMinRange(), mathTest.getMaxRange());

        sb.append(target_a)
                .append("(은/는) ").append(x).append("개의 ").append(interest).append("(을/를)").append(y)
                .append("묶음 가지고 있습니다.\n");
        sb.append(target_a).append("(은/는) 전부 ").append(interest).append("(이/가) 몇 개입니까?.\n");

        return sb.toString();
    }

    @Override
    public int getAnswer() {
        return x * y;
    }
}
