package lecture.week6.problem04;

/**
 * @author 2017112095 컴퓨터공학과 최준호
 * Shape의 추상클래스 중 Triangle
 */
public class Triangle extends Shape{

    Triangle(Color color) {
        super(color);
    }

    @Override
    void applyColor() {
        System.out.println("Triangle filled with color "+ color.getColor());
    }
}
