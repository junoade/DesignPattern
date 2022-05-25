package lecture.week10.ex05;

public class Adventurer {
    private StateSnapshot current_state;

    public Memento createMemento(){
        return new Memento(this.current_state);
    }
    public void setMemento(Memento memento){
        current_state = memento.getState();

    }
    public StateSnapshot getState(){
        return current_state;
    }
}
