package lecture.week11.state;

public interface State {
    String status();
    void complete(Door doorContext);
    void timeout(Door doorContext);
    void click(Door doorContext);
}
