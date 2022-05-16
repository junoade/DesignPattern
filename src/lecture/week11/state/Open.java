package lecture.week11.state;

public class Open implements State {

    @Override
    public String status() {
        return "Open";
    }

    @Override
    public void complete(Door doorContext) {
        // do nothing
    }

    @Override
    public void timeout(Door doorContext) {
        doorContext.setState(new Closing());
        System.out.println("Door is closing...");
    }

    @Override
    public void click(Door doorContext) {
        doorContext.setState(new StayOpen());
        System.out.println("Door is staying open.");
    }
}
