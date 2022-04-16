package lecture.week6.problem04;

/**
 * @author 2017112095 컴퓨터공학과 최준호
 * 테스트용 메인 코드
 */
public class BridgePatternTest {
    public static void main(String[] args) {
        Shape tri = new Triangle(new RedColor());
        tri.applyColor();

        Shape pent = new Pentagon(new GreenColor());
        pent.applyColor();
    }
}
