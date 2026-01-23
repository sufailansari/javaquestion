package com.String;

import java.util.Scanner;

public class NumberPalindrom {
    public static boolean ispalindrome(int x){
        int revers=0;
        int temp=x;
        if(x<0||x==0&& x % 10==0){
            return  false;
        }
        while(x!=0){
            int remender = x%10;
            revers = revers*10+remender;
            x=x/10;
        }
        return (revers==temp);



    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        boolean palindrome = ispalindrome(num);
        if(palindrome){
            System.out.println("The string is palindrome");
        }
        else{System.out.println("The string is not palindrome");
        }
    }
}
