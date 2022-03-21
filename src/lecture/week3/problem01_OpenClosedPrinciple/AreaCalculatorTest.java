package lecture.week3.problem01_OpenClosedPrinciple;

public class AreaCalculatorTest {
    public static void main(String[] args){
        AreaCalculator cal = new AreaCalculator();
        Circle_After c1 = new Circle_After();
        c1.radius = 3.0;
        System.out.println(cal.calculateShapeArea(c1));
    }
}
