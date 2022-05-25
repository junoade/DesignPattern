package lecture.week10.ex05;

public class Memento {
    private StateSnapshot current_state;

    Memento(StateSnapshot state){
        this.current_state = state;
    }
    public StateSnapshot getState(){
        return current_state;
    }
    public void setState(StateSnapshot state){
        this.current_state = state;
    }
}
