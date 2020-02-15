import java.util.ArrayList;

public class TwoNumbersSum {
    public static boolean pair(int[] array, int sum){
        ArrayList<Integer> complements = new ArrayList<Integer>();
        boolean result = false;

        for (int i = 0; i < array.length; ++i){
            int possibleMatch = sum - array[i];
            if (complements.contains(array[i])){
                result = true;
            }
            complements.add(possibleMatch);
        }
        return result;
    }
}
