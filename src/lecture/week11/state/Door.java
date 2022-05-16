package lecture.week11.state;

import java.util.Observable;

/* Context 클래스*/
public class Door extends Observable {
    private State state;

    public void setState(State state){
        this.state = state;
        setChanged();
        notifyObservers();
    }

    public void complete(){
        state.complete(this);
    }

    public void timeout(){
        state.timeout(this);
    }

    public void click(){
        state.click(this);
    }

}
