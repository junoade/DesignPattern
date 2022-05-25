package lecture.week10.ex05;

import java.util.List;

public class StateSnapshot {
    private int HP;
    private int MP;
    private List<Item> Items;
    private Map map;
    private Position position;

    public StateSnapshot() {
        HP = 100;
        MP = 100;
        Items = null; // later fill
        map = null; // later fill
        position = null; // later fill
    }

    // 기록된 State의 정보의 값 전부 새로운 객체에 복사 deep copy
    public StateSnapshot(StateSnapshot state) {
        HP = state.getHp();
        MP = state.getMp();
        Items = state.getItems();
        map = state.getCurrentMap();
        position = state.getPosition();
    }

    public int getHp() {
        return HP;
    }

    public int getMp() {
        return MP;
    }

    public List<Item> getItems() {
        return Items;
    }

    public Map getCurrentMap() {
        return map;
    }

    public Position getPosition() {
        return position;
    }

    public void setHp(int hp) {
        HP = hp;
    }

    public void setMp(int mp) {
        MP = mp;
    }

    public void setItems(List<Item> items) {
        Items = items;
    }

    public void setCurrentMap(Map m) {
        map = m;
    }

    public void setPosition(Position p) {
        position = p;
    }


}
