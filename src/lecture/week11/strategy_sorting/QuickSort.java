package lecture.week11.strategy_sorting;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class QuickSort implements Sortable {
    @Override
    public List<String> sort(List<String> items) {

        return items.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList()); // Arrays.sort() 의 경우 듀얼 피봇 퀵정렬 이용
    }

}
