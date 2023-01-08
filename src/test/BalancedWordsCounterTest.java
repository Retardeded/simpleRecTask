package test;

import main.BalancedWordsCounter;
import main.BubbleSort;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class BalancedWordsCounterTest {

    @Test
    public void testBalancedWordsCounterNormalCase() {
        BalancedWordsCounter balancedWordsCounter = new BalancedWordsCounter();
        String input1 = "aabbabcccba";

        var result1 = balancedWordsCounter.count(input1);
        //correct is 29 i think..
        assert(result1 == 28);
    }

    @Test
    public void testBalancedWordsCounterEmpty() {
        BalancedWordsCounter balancedWordsCounter = new BalancedWordsCounter();
        String input1 = "";

        var result1 = balancedWordsCounter.count(input1);
        assert(result1 == 0);
    }

    @Test
    public void testBalancedWordsCounterNonStringInput() {
        BalancedWordsCounter balancedWordsCounter = new BalancedWordsCounter();
        String input1 = "abababa1";

        var result1 = balancedWordsCounter.count(input1);
    }

    @Test
    public void testBalancedWordsCounterNull() {
        BalancedWordsCounter balancedWordsCounter = new BalancedWordsCounter();
        String input1 = null;

        var result1 = balancedWordsCounter.count(input1);
    }
}
