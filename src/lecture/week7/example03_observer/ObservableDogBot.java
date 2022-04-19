package lecture.week7.example03_observer;

import java.util.Observable;

/**
 * lab07-문제 3번
 * ObserverableDogBot 클래스
 * 자신의 상태 변화에 따라 observing하는 객체, observer들에게 상태 전달을 하는 subject 역할
 * 2017112095 컴퓨터공학과 최준호
 */
public class ObservableDogBot extends Observable implements DogBot {

    DogBot dogBot;

    /* 관찰 대상이 될 DogBot 인스턴스 생성 */
    public ObservableDogBot(DogBot dogBot) {
        this.dogBot = dogBot;
    }

    /* Observed 되는 subject로서, observer에게 안내할 API 기본적으로 상속 */
    /* register, remove, notify */
    // public synchronized void addObserver(Observer o);
    // public synchronized void deleteObserver(Observer o);
    // public void notifiyObservers();

    public void watcherNotifying(Object arg) { // 재사용성을 위해
        setChanged(); // 먼저 상태 변화함을 명시적으로,
        notifyObservers(arg); // 어떤 내용을 알릴 것인지,
        clearChanged(); // 상태 변화 종료 명시적으로
    }

    @Override
    public boolean eat() { // 현재 DogBot이 eat하는 상태라면, notify
        boolean status = dogBot.eat(); // hungry 하면 true
        if (status) {
            watcherNotifying("Eating now");
        } else {
            watcherNotifying("Not Hungry now ");
        }

        return status;
    }

    @Override
    public void rest() {
        dogBot.rest();
        watcherNotifying("Resting now");
    }

    @Override
    public void play() {
        dogBot.play();
        watcherNotifying("Playing now");
    }

    @Override
    public String noise() {
        watcherNotifying("Making Noise Now");
        return dogBot.noise();
    }


    /* toString overriding 해주기 */
    @Override
    public String toString(){
        return dogBot.toString();
    }
}
