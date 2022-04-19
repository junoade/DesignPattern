package lecture.week7.example03_observer;

/**
 * lab07-문제 3번
 * 2017112095 컴퓨터공학과 최준호
 */
public class PlainDogBot implements DogBot {
    protected int hungry, tired;
    String name;

    public PlainDogBot(int h, int t, String n) {
        hungry = h;
        tired = t;
        name = n;
    }

    public boolean eat() {
        if (hungry > 6) {
            hungry -= 3;
            return true;
        } else
            return false;
    }

    public void rest() {
        hungry++;
        tired -= 2;
    }

    public void play() {
        hungry += 2;
        tired += 3;
    }

    public String noise() {
        if (hungry > 8 && tired < 11)
            return "whine ";
        else if (tired > 7 && tired > hungry)
            return "snore ";
        else
            return "woof ";
    }
    /* toString overriding 해서 현재 DogBot name 반환해주기 */
    @Override
    public String toString(){
        return name;
    }
}