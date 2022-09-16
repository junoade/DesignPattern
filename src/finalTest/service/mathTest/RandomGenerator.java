package finalTest.service.mathTest;

import java.util.ArrayList;

public class RandomGenerator {
    public static String randomExtract(ArrayList<String> target) {
        int idx = (int) (Math.random() * target.size());
        return target.get(idx);
    }

    public static int randomInteger(int minIdx, int maxIdx) {
        return (int) (Math.random() * (maxIdx - minIdx + 1) + minIdx);
    }
}
