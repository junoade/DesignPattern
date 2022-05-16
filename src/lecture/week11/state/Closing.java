package lecture.week11.state;

public class Closing implements State{
    @Override
    public String status() {
        return "Closing";
    }

    @Override
    public void complete(Door doorContext) {
        doorContext.setState(new Closed());
        System.out.println("Door is closed.");
    }

    @Override
    public void timeout(Door doorContext) {
        // do nothing
    }

    @Override
    public void click(Door doorContext) {
        doorContext.setState(new Opening());
        System.out.println("Door is opening...");
    }
}
