package com.String;

import java.util.Scanner;

public class FindFirstOccorenceOfIndex {
    public static int findFirstOccurrence(String haystack, String needle) {
        //String Str;
        if (haystack.length()<needle.length()) {
            return -1;
        }else {
            if (haystack.length() == needle.length()) {
                if (haystack.equals(needle)) {
                    return 0;
                }
                else {
                    return -1;
                }
            }
            for (int i = 0; i <= haystack.length() - needle.length(); i++) {
                String str;

                if (haystack.charAt(i) == needle.charAt(0)) {
                    str = haystack.substring(i, i + (needle.length()));
                    if (str.equals(needle)) {
                        return i;
                    }
                }
            }
        }
        return -1;


    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string");
        String haystack = input.nextLine();
        System.out.println("Enter the needle");
        String needle = input.nextLine();
        int result =  findFirstOccurrence(haystack, needle);
        System.out.println(result);

    }
}
