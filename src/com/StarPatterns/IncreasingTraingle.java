package com.StarPatterns;

public class IncreasingTraingle {
    public static void main(String[] args) {
        int n =5;
        for (int i = 1 ; i <= n ; i++){ //This line needs no change, same as Square one, it prints the n rows
            for (int j = 1 ; j <= i ; j++){ //Here the no of stars to be printed in each row is actually the row number itself
                // For example ; Row no 1 has 1 star , Row 2 has 2 stars..........
                //So wht u need to change here is just set the INNER LOOP to run from 1 to i
                System.out.print("* ");
            }
            System.out.println(); //after printing one row, come to the next row
        }
    }
}

//OUTPUT
            /*

             *
             * *
             * * *
             * * * *
             * * * * *

             */
