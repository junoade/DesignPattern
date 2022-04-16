package lecture.week6.problem02;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 2017112095 컴퓨터공학과 최준호
 * Shape 형 인터페이스를 구현하는 컴포넌트들에 대해 컴포지트 역할 수행
 */
public class Drawing implements Shape{
    List<Shape> list; // 현재 자신이 포함하는 모든 컴포넌트들의 리스트

    Drawing(){
        list = new ArrayList<>(); // 인스턴스 생성
    }
    public void add(Shape shape){
        list.add(shape);
    }

    public void remove(Shape shape){
        list.remove(shape);
    }

    public void clear(){
        list.clear();
        System.out.println("Clearing all the shapes from drawing");
    }

    @Override
    public void draw(String color){
        for (Shape shape : list) {
            shape.draw(color);
        }
    }

}
