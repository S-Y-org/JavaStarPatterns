package com.StarPatterns;

public class ReverseHillPattern {
    public static void main(String[] args) {
        int n =5;
        for (int i = 1 ; i <= n ; i++){
            for (int j = 1 ; j<=i ; j++){ //increasing traingle
                System.out.print("  "); //Here the print statement will print space only
            }
            for (int j = i ; j < n ; j++){ //decreasing traingle
                System.out.print("* "); //This will print stars
            }
            for (int j = i; j<=n;j++){
                System.out.print("* ");
            }
            System.out.println(); //after printing one row, come to the next row
        }
    }
}
