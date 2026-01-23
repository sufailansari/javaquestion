package com.String;

import java.util.Scanner;

public class CheckPalidrome {

    public  static boolean ispalindrom(String str) {
        int i=0;
        int j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = input.nextLine();
        boolean palindrome = ispalindrom("str");
        if(palindrome){
            System.out.println("The string is palindrome");
        }
        else{
            System.out.println("The string is not palindrome");
        }
        input.close();
    }
}
