package lecture.week11.strategy_sorting;

import java.util.ArrayList;
import java.util.List;

public class SortedList {
    List<String> items;
    Sortable sort_method;

    SortedList(){
        items = new ArrayList<>();
    }

    public void add(String item){
        items.add(item);
    }

    public void setSort_method(Sortable sort_method){
        this.sort_method = sort_method;
    }

    public void sort(){
        items = sort_method.sort(items);
    }
}
