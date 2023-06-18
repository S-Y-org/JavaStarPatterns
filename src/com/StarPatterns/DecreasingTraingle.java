package com.StarPatterns;

public class DecreasingTraingle {
    public static void main(String[] args) {
        int n =5;
        for (int i = 1 ; i <= n ; i++){ //This line needs no change, same as Square one, it prints the n rows
            for (int j = i ; j <= n ; j++){ //Here we will change the start condition.
                /*So for the 1st row; loop will run from 1 to 5 printing 5 star
                * for the 2nd row  ; loop will run from 2 to 5 printing 4 star
                * .
                * .
                * .
                * for the 5th row ; loop will run from 5 to 5 printing 1 star*/

                /*Here wht u need to remember this that the decreasing traingle ;
                * OUTERLOOP IS FROM 1 TO n
                * INNER LOOP IS FROM i to n */
                System.out.print("* ");
            }
            System.out.println(); //after printing one row, come to the next row
        }
    }
}

//OUTPUT
                    /*

                     * * * * *
                     * * * *
                     * * *
                     * *
                     *

                     */
