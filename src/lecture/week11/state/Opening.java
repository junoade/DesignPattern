package lecture.week11.state;

public class Opening implements State{
    @Override
    public String status() {
        return "Opening";
    }
    @Override
    public void complete(Door doorContext) {
        doorContext.setState(new Open());
        System.out.println("Door Open complete");
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
