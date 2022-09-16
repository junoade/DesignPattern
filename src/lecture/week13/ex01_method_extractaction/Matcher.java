package lecture.week13.ex01_method_extractaction;

public class Matcher {
    public Matcher(){}

    public boolean match(int[] expected, int[] actual, int clipLimit, int delta){
        // Clip "too-large" values
        clipLargeValues(actual, clipLimit);

        // Check for length Difference and
        if(isEqualLength(expected, actual)){
            for(int i = 0; i < actual.length; i++){
                if(Math.abs(expected[i] - actual[i]) > delta)
                    return false;
            }
            return true;
        }else{
            return false;
        }
    }

    public void clipLargeValues(int[] actual, int clipLimit){
        for(int i = 0; i < actual.length; i++){
            if(actual[i] > clipLimit)
                actual[i] = clipLimit;
        }
    }

    public boolean isEqualLength(int[] expected, int[] actual){
        return actual.length == expected.length;
    }

    public static void main(String[] args) {
        int[] actual = {1,99, 55, 44, 2};
        int[] expected = {1, 2, 2, 2, 2};
        Matcher matcher = new Matcher();

        if(matcher.match(expected, actual, 2, 0))
            System.out.println("무야호");
    }
}
