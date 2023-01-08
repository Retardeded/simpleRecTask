package test;

import main.BubbleSort;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class BubbleSortTest {

    @Test
    public void testBubbleSortNaturalNums() {
        BubbleSort bubbleSort = new BubbleSort();
        ArrayList<Comparable> input1 = new ArrayList<>(
                List.of(1,4,5,6,8,3,8));

        var result1 = bubbleSort.sort(input1);
        assert(result1.equals(List.of(1, 3, 4, 5, 6, 8, 8)));
    }

    @Test
    public void testBubbleSortRationalNums() {
        BubbleSort bubbleSort = new BubbleSort();
        ArrayList<Comparable> input1 = new ArrayList<>(
                List.of(-9.3,0.2,4,0.1,5,9));

        var result1 = bubbleSort.sort(input1);
        assert(result1.equals(List.of(-9.3, 0.2, 0.1, 4, 5, 9)));
    }

    @Test
    public void testBubbleSortEmpty() {
        BubbleSort bubbleSort = new BubbleSort();
        ArrayList<Comparable> input1 = new ArrayList<Comparable>();

        var result1 = bubbleSort.sort(input1);
        assert(result1.equals(List.of()));
    }

    @Test
    public void testBubbleSortWithNull() {
        BubbleSort bubbleSort = new BubbleSort();

        ArrayList<Comparable> input1 = new ArrayList<Comparable>();
        input1.add(null);
        input1.add(5.0001);

        var result1 = bubbleSort.sort(input1);
        assert(result1.equals(List.of(5.0001)));
    }
}
