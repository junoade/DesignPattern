package lecture.week7.example02_Singleton;

public class SingletonExercise {
    public static void main(String[] args){
        Deck deck = Deck.getInstance();
        deck.print();
    }
}
