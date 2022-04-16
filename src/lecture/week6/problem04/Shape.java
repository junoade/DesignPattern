package lecture.week6.problem04;

/**
 * @author 2017112095 컴퓨터공학과 최준호
 * Shape와 관련된 부분은 별도의 추상클래스로, Color를 포함하는 관계로 변경
 */
public abstract class Shape {
    Color color;

    Shape(Color color){
        this.color = color;
    }

    abstract void applyColor();
}
