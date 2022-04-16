package lecture.week6.problem04;

/**
 * @author 2017112095 컴퓨터공학과 최준호
 * Shape의 추상클래스 중 Pentagon
 */
public class Pentagon extends Shape{

    Pentagon(Color color) {
        super(color);
    }

    @Override
    void applyColor() {
        System.out.println("Pentagon filled with color "+ color.getColor());
    }
}
