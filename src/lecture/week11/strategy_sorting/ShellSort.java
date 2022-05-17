package lecture.week11.strategy_sorting;

import java.util.Collections;
import java.util.List;

public class ShellSort implements Sortable {
    @Override
    public List<String> sort(List<String> items) {

        return shell_sort_knuth(items);
    }

    public List<String> shell_sort_knuth(List<String> list) {
        int L = list.size();
        int h = 1;
        while (h < L / 3)
            h = 3 * h + 1;

        while (h >= 1) {
            for (int i = h; i < L; i++) {
                // 여기는 insertion sort와 같다.
                for (int j = i; j >= h && list.get(j).compareTo(list.get(j-h))>0; j -= h) {
                    Collections.swap(list, j, j-h);
                }
            }
            h /= 3;
        }

        return list;
    }
}
