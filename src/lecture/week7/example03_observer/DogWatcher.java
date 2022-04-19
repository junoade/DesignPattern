package lecture.week7.example03_observer;

import java.util.Observable;
import java.util.Observer;

/**
 * lab07-문제 3번
 * DogWatcher 클래스, 옵저버 역할
 * 2017112095 컴퓨터공학과 최준호
 */
public class DogWatcher implements Observer {

    String name;

    public DogWatcher(String name){
        this.name = name;
    }

    /* 현재 observer가 관찰중인 subject(observable), update 안내 */
    @Override
    public void update(Observable o, Object arg) {
        System.out.println(name + " is now observing, " + o + " "+ arg);
    }
}
