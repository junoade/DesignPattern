package lecture.week10.ex05;

public class Client {
    Adventurer adventurer;
    CareTaker careTaker;

    public void play(){
        adventurer = new Adventurer();
        careTaker = new CareTaker();

        System.out.println("게임을 시작합니다");

        /* 게임 관련 로직 */
    }

}
