package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class BubbleSort {

    public ArrayList<Comparable> sort(ArrayList<Comparable> input) {
        input.removeAll(Collections.singleton(null));
        if(input.isEmpty()) {
            throw new RuntimeException();
        }
        input.sort(new NumsComparator());
        return input;
    }

    class NumsComparator implements Comparator<Comparable> {
        @Override
        public int compare(Comparable a, Comparable b) {
            double aDouble = Double.parseDouble(a.toString());
            double bDouble = Double.parseDouble(b.toString());
            return (int) (aDouble - bDouble);
        }
    }
}
