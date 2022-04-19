package lecture.week7.example02_Singleton;

/**
 * lab07-문제 2번
 * 2017112095 컴퓨터공학과 최준호
 */
public class Card {
    private Suit suit;
    private int number;

    public Card(Suit s, int n) {
        suit = s;
        if ((n < 2) || (n > 14)) {
            throw new IllegalArgumentException();
        }
        number = n;
    }

    public void print() {
        switch (number) {
            case 11:
                System.out.print("Jack");
                break;
            case 12:
                System.out.print("Queen");
                break;
            case 13:
                System.out.print("King");
                break;
            case 14:
                System.out.print("Ace");
                break;
            default:
                System.out.print(number);
                break;
        }
        System.out.print(" of ");
        switch (suit) {
            case SPADES:
                System.out.println("spades.");
                break;
            case HEARTS:
                System.out.println("hearts.");
                break;
            case CLUBS:
                System.out.println("clubs.");
                break;
            case DIAMONDS:
                System.out.println("diamonds.");
                break;
        }
    }


}
