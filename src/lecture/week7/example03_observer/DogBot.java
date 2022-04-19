package lecture.week7.example03_observer;

/**
 * lab07-문제 3번
 * 기본적인 DogBot의 기능에 대한 명세
 * 2017112095 컴퓨터공학과 최준호
 */
public interface DogBot {
    boolean eat();
    void rest();
    void play();
    String noise();
}
