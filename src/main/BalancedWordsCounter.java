package main;

import java.util.HashMap;

public class BalancedWordsCounter {
    public int count(String input) {
        if(input == null) {
            throw new RuntimeException();
        }
        int counter = input.length();

        int wordLength = 2;
        while(true) {
            for(int i = 0; i+wordLength <= input.length(); i+=wordLength) {
                var word = input.substring(i, i+wordLength);
                if(checkBalancedWord(word)) {
                    counter++;
                }
            }
            wordLength++;
            if(wordLength > input.length())
                break;
        }

        return counter;
    }

    private boolean checkBalancedWord(String word) {
        HashMap<String, Integer> repetitions = new HashMap<>();
        for(int i = 0; i < word.length(); i++) {
            var letter = word.charAt(i);
            if(Character.isDigit(letter)) {
                throw new RuntimeException();
            }
            repetitions.put(String.valueOf(letter), repetitions.getOrDefault(letter,0)+1);
        }

        int balancedValue = repetitions.get(String.valueOf(word.charAt(0)));

        for (String key : repetitions.keySet()) {
            if(repetitions.get(key) != balancedValue) {
                return false;
            }
        }

        return true;
    }
}
