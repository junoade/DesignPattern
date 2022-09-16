package finalTest.service.mathTest;

import finalTest.service.studentInfo.StudentInfo;

public class Division implements OperatorState {

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
                .append("(은/는) ").append(interest)
                .append("(을/를) ").append(x)
                .append("개 가지고 있습니다. ");
        sb.append("(그/그녀)는 ").append(y).append("의 친구에게 똑같이 나누어 주고 싶습니다.\n");
        sb.append("각각 ").append(interest).append("(을/를) 몇 개씩 가지게 되나요? 소수점은 내림하세요.");

        return sb.toString();
    }

    @Override
    public int getAnswer() {
        return x / y;
    }
}
