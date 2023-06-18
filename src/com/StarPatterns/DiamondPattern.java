package com.StarPatterns;

public class DiamondPattern {
    public static void main(String[] args) {
        int n =5;
        for (int i = 1 ; i < n ; i++){ //i<n to print one less row
            for (int j = i ; j<=n ; j++){ //decreasing traingle
                System.out.print("  "); //Here the print statement will print space only
            }
            for (int j = 1 ; j < i ; j++){ //increasing traingle , and make the condition from j<=i to j<i to reduce one column
                System.out.print("* "); //This will print stars
            }
            for (int j = 1 ; j <= i ; j++){
                System.out.print("* ");
            }
            System.out.println(); //after printing one row, come to the next row
        }
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

/*Here we have to print a pattern below another pattern*/

//We already have the code to Hill pattern and the inverted hill pattern

//Just place the 2 codes one below the other

//To get the pointed edges print one less row

//Just adjust the OUTERLOOP of hill pattern to delete the last printed row