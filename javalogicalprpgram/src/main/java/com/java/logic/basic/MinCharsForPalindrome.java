package com.java.logic.basic;

public class MinCharsForPalindrome {

    static int minCharsToAddForPalindrome(String str) {
        int n = str.length();
        int[] lps = new int[n]; // Array to store the Longest Palindromic Prefix

        int i = 1;
        int len = 0;

        while (i < n) {
            if (str.charAt(i) == str.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }

        // The minimum characters needed to make the string a palindrome
        return n - lps[n - 1];
    }

    public static void main(String[] args) {
        String str = "abcd";
        int minChars = minCharsToAddForPalindrome(str);
        System.out.println("Minimum characters to add: " + minChars);
    }
}
