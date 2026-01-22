package com.String;

public class AllPosisbleSubstring {
    public static void main(String[] args) {
        String str="abcdefg";
        int n=str.length();
//        for(int j=0;j<str.length();j++){
//            for(int k=j;k<str.length();k++){
//                for(int l=j;l<=k;l++){
//                    System.out.print(str.charAt(l));
//                }
//                System.out.println();
//            }
//        }
        for(int j=0;j<n;j++){
            for(int k=j;k<n;k++){

                System.out.println(str.substring(j,k+1));


            }
            System.out.println();
        }

    }
}
