import org.junit.Assert;
import org.junit.Test;

public class TwoNumbersSumTest {
    @Test
    public void array_with_two_to_make_sum(){
        boolean result = true;
        TwoNumbersSum numbers = new TwoNumbersSum();
        int sum  = 17;
        int[] array = {3, 7, 10, 15};
        Assert.assertEquals(result, numbers.pair(array, sum));
    }
    @Test
    public void array_without_two_to_make_sum(){
        boolean result = false;
        TwoNumbersSum numbers = new TwoNumbersSum();
        int sum = 12;
        int[] array = {2, 5, 3, 15};
        Assert.assertEquals(result, numbers.pair(array, sum));
    }
}
