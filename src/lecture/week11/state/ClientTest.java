package lecture.week11.state;

public class ClientTest {
    public static void main(String[] args){
        Door myDoor = new Door();
        myDoor.setState(new Opening());
        myDoor.click();
        myDoor.click();
        myDoor.complete();
        myDoor.timeout();
        myDoor.complete();
        myDoor.complete();
    }
}
