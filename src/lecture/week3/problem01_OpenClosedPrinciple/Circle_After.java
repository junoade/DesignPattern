package lecture.week3.problem01_OpenClosedPrinciple;

public class Circle_After implements Calculable{
    public double radius;
    public static final double PI = Math.PI;
    @Override
    public double calculate() {
        return PI * Math.pow(radius, 2);
    }
}
