package lecture.week7.example02_Singleton;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * lab07-문제 2번
 * 2017112095 컴퓨터공학과 최준호
 *
 * Singleton 클래스로 만들기
 */
public class Deck {
    private List<Card> cards;

    /* 처음부터 하나의 인스턴스를 생성하여, Deck 클래스가 ClassLoader에 의해 로드됨에 따라 바로 인스턴스를 생성하는 방식 Eager */
    // private static final Deck deck = new Deck();
    // 포인트 : JVM에서 Deck 클래스를 로딩하고 static 관련 부분을 초기화 하고 나서야, 각 쓰레드에서 해당 인스턴스에 접근할 수 있다.
    // 언제 사용될지 모르는데, 먼저 생성하여 자리를 차지 한다는 단점도 있다.

    private static Deck deck;

    private Deck() {
        cards = new ArrayList<Card>();

        // build the deck
        Suit[] suits = {Suit.SPADES, Suit.HEARTS, Suit.CLUBS, Suit.DIAMONDS};
        for (Suit suit : suits) {
            for (int i = 2; i <= 14; i++) {
                cards.add(new Card(suit, i));
            }
        }

        // shuffle it!
        Collections.shuffle(cards, new Random());
    }

    /* deck 인스턴스를 한번만 생성하도록, lazy */
    public static Deck getInstance(){
        if(deck == null){
            /* double check locking */
            synchronized (Deck.class){ // 멀티 쓰레딩시, 쓰레드별로, 인스턴스를 initiate 하는 시점에 따라 달라질 수 있음.
                if(deck == null){
                    deck = new Deck();
                }
            }
        }
        return deck;
    }

    public void print() {
        for (Card card : cards) {
            card.print();
        }
    }
}
