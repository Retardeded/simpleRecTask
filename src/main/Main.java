package main;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BalancedWordsCounter balancedWordsCounter = new BalancedWordsCounter();
        String input = null;
        var counted = balancedWordsCounter.count(input);
        System.out.println(counted);
    }
}