package lecture.week10.ex05;

import java.util.*;

public class CareTaker {
    List<Memento> mementoList;

    public void add(Memento mem){
        mementoList.add(mem);
    }

    public Memento get(int idx){
        return mementoList.get(idx);
    }

}
