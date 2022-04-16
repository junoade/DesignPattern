package lecture.week6.problem02;

/**
 * @author 2017112095 컴퓨터공학과 최준호
 * 도형 Shape의 컴포넌트 중 Triangle에 해당하는 클래스
 */
public class Triangle implements Shape {

    Triangle() { } // default constructor, 주어진 설계에서 속성이 따로 없어서

    @Override
    public void draw(String color) { // color를 인자로 받아서, 그리는 부분
        System.out.println("Drawing Triangle with color " + color);
    }
}
