package finalTest.service.mathTest;

import finalTest.service.studentInfo.StudentInfo;

public class Addition implements OperatorState {
    private String target_a;
    private String target_b;
    private String interest;
    private int x;
    private int y;

    @Override
    public String getStatement(MathTest mathTest) {

        StringBuffer sb = new StringBuffer();
        StudentInfo temp = mathTest.getRef_student();
        target_a = RandomGenerator.randomExtract(temp.getRelatedNames());
        target_b = RandomGenerator.randomExtract(temp.getRelatedNames());
        interest = RandomGenerator.randomExtract(temp.getInterests());
        x = RandomGenerator.randomInteger(mathTest.getMinRange(), mathTest.getMaxRange());
        y = RandomGenerator.randomInteger(mathTest.getMinRange(), mathTest.getMaxRange());

        sb.append(target_a)
                .append("(은/는) ").append(interest)
                .append("(을/를) ").append(x)
                .append("개 가지고 있습니다. ");
        sb.append(target_b).append("(은/는) ").append(interest).append("(을/를) ")
                .append(y);
        sb.append("개 가지고 있습니다. \n").append("그들이 가지고 있는 ").append(interest).append("(은/는) 모두 몇 개입니까?\n");

        return sb.toString();
    }

    @Override
    public int getAnswer(){
        return x+y;
    }
}
