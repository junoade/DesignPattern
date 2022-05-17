package lecture.week11.strategy_sorting;

import java.util.ArrayList;
import java.util.List;

public class MergeSort implements Sortable {

    @Override
    public List<String> sort(List<String> items) {
        return mergeSort(items);
    }

    public List<String> mergeSort(List<String> list) {
        List<String> sorted = new ArrayList<>();
        if (list.size() == 1) {
            sorted = list;
        } else {
            int mid1 = list.size() / 2;
            ArrayList<String> left = new ArrayList<>();
            ArrayList<String> right = new ArrayList<>();

            /* 초기에 분할 */
            for (int x = 0; x < mid1; x++) {
                left.add(list.get(x));

            }
            for (int x = mid1; x < list.size(); x++) {
                right.add(list.get(x));
            }

            mergeSort(left);
            mergeSort(right);
            sorted = merge(left, right);
        }
        return sorted;
    }

    public ArrayList<String> merge(ArrayList<String> left, ArrayList<String> right) {
        ArrayList<String> merged = new ArrayList<String>();

        int i = 0;
        int l = 0;
        int r = 0;

        while (l < left.size() && r < right.size()) {
            /* 문자열 비교 */
            if ((left.get(l)).compareTo(right.get(r)) < 0) {
                merged.add(left.get(l));
                l++;
            } else {
                merged.add(right.get(r));
                r++;
            }

            i++;
        }

        while (l < left.size()) {
            merged.add(left.get(l));
            l++;
            i++;
        }

        // Append rest of the values in the right half, if any...
        while (r < right.size()) {
            merged.add(right.get(r));
            r++;
            i++;
        }

        return merged;
    }
}
