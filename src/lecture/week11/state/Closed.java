package lecture.week11.state;

public class Closed implements State {
    @Override
    public String status() {
        return "Closed";
    }

    @Override
    public void complete(Door doorContext) {
        // do nothing
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
