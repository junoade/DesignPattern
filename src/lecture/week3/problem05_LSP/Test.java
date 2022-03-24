package lecture.week3.problem05_LSP;

public class Test {
    public static void main(String[] args){
        /*Rectangle r = new Square(5);
        System.out.println(r.getHeight() + " " + r.getWidth());
        r.setHeight(5);
        r.setWidth(6);
        System.out.println(r.getHeight() + " " + r.getWidth());

        Square s = (Square) r;
        System.out.println(r.getHeight() + " " + r.getWidth());*/

        Shape s1 = new Rectangle(5, 3);
        Shape s2 = new Square(5);
        System.out.println(s1.getArea());
        System.out.println(s2.getArea());
        // Rectangle r = (Rectangle) s1;
        // System.out.println(r.getWidth());
    }
}
