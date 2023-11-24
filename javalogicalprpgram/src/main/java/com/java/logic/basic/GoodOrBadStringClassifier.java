package com.java.logic.basic;

public class GoodOrBadStringClassifier {
    
    static boolean isVowel(char ch) {
        return "aeiou".indexOf(ch) != -1;
    }

    static boolean classifyString(String s) {
        int consecutiveConsonants = 0;
        int consecutiveVowels = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '?') {
                consecutiveConsonants++;
                consecutiveVowels++;
            } else if (isVowel(ch)) {
                consecutiveConsonants = 0;
                consecutiveVowels++;
            } else {
                consecutiveVowels = 0;
                consecutiveConsonants++;
            }

            if (consecutiveConsonants > 3 || consecutiveVowels > 5) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String inputString = "abcde??fg";
        boolean result = classifyString(inputString);
        System.out.println(result);
    }
}