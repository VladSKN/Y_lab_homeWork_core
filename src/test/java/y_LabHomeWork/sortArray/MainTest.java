package y_LabHomeWork.sortArray;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;


public class MainTest {
    private final int[] array = new int[]{5, 6, 3, 2, 5, 1, 4, 9};

    @Test
    public void testMergeSort() {
        int[] arrayLibSort = array;

        Arrays.sort(arrayLibSort);

        int[] myMergeSort = Main.mergeSort(array, array.length);

        Assert.assertArrayEquals(myMergeSort, arrayLibSort);
    }

    @Test
    public void testArrayNull() {
        int[] testArray = Main.mergeSort(null, 0);

        Assert.assertNull(testArray);
    }

    @Test
    public void testEmptyArray() {

        int[] testArray = Main.mergeSort(new int[0], 0);

        Assert.assertArrayEquals(new int[0], testArray);
    }

    @Test
    public void testOneValueInArray() {

        int[] testArray = Main.mergeSort(new int[]{1}, 1);

        Assert.assertArrayEquals(new int[]{1}, testArray);
    }

    @Test
    public void testTwoValueInArray() {

        int[] testArray = Main.mergeSort(new int[]{1, 2}, 2);

        Assert.assertArrayEquals(new int[]{1, 2}, testArray);
    }

}