package s06.test.sumTest;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TwoNumbersSumTest {

    private TwoNumbersSum sum = new TwoNumbersSum();

    @Test
    public void testSimpleSum() {
        ArrayList<Integer> result = sum.addTwoNumbers(
                new ArrayList<>(Arrays.asList(1, 2)), // 12
                new ArrayList<>(Arrays.asList(3, 4))  // 34
        );
        assertEquals(Arrays.asList(4, 6), result); // 12 + 34 = 46
    }

    @Test
    public void testWithCarry() {
        ArrayList<Integer> result = sum.addTwoNumbers(
                new ArrayList<>(Arrays.asList(9, 9)), // 99
                new ArrayList<>(Arrays.asList(1))     // 1
        );
        assertEquals(Arrays.asList(1, 0, 0), result); // 99 + 1 = 100
    }

    @Test
    public void testDifferentLengths() {
        ArrayList<Integer> result = sum.addTwoNumbers(
                new ArrayList<>(Arrays.asList(1)),     // 1
                new ArrayList<>(Arrays.asList(9, 9))   // 99
        );
        assertEquals(Arrays.asList(1, 0, 0), result); // 1 + 99 = 100
    }

    @Test
    public void testZeroSum() {
        ArrayList<Integer> result = sum.addTwoNumbers(
                new ArrayList<>(Arrays.asList(0)),
                new ArrayList<>(Arrays.asList(0))
        );
        assertEquals(Arrays.asList(0), result); // 0 + 0 = 0
    }

    @Test
    public void testLargeNumbers() {
        ArrayList<Integer> result = sum.addTwoNumbers(
                new ArrayList<>(Arrays.asList(9, 8, 7, 6)), // 9876
                new ArrayList<>(Arrays.asList(1, 2, 3, 4))  // 1234
        );
        assertEquals(Arrays.asList(1, 1, 1, 1, 0), result); // 9876 + 1234 = 11110
    }
}

