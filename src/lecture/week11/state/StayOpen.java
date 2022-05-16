package lecture.week11.state;

public class StayOpen implements State{
    @Override
    public String status() {
        return "StayOpen";
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
        doorContext.setState(new Closing());
        System.out.println("Door is closing...");
    }
}
