package com.StarPatterns;

public class RightSidedTraingle {
    public static void main(String[] args) {
        int n =5;
        for (int i = 1 ; i <= n ; i++){
            for (int j = i ; j<=n ; j++){ //decreasing traingle
                System.out.print("  "); //Here the print statement will print space only
            }
            for (int j = 1 ; j <= i ; j++){ //increasing traingle
                System.out.print("* "); //This will print stars
            }
            System.out.println(); //after printing one row, come to the next row
        }
    }
}

/*IMPORTANT POINT TO REMEMBER*/

// 1)println statement is always linked to OUTER LOOP, we do not repeat it with every inner loop

//2)If u are printing a * with one space in the end (that means 2 characters in the print statement) , then ur spaces also has to be 2 spaces

//3)So basically the no of character we use in the print statement have to be the same, otherwise u will see a distorted pattern


//Another RIGHTSIDED TRAINGLE

    /*public static void main(String[] args) {
        int n =5;
        for (int i = 1 ; i <= n ; i++){
            for (int j = 1 ; j<=i ; j++){ //increasing traingle
                System.out.print("  "); //Here the print statement will print space only
            }
            for (int j = i ; j <= n ; j++){ //decreasing traingle
                System.out.print("* "); //This will print stars
            }
            System.out.println(); //after printing one row, come to the next row
        }
    }*/


/*DIFFERENT TYPES OF PATTERNS*/


/*
1)Right Traingle : Made from DECREASING TRAINGLE OF SPACES and INCREASING TRAINGLE OF STARS

* 2)Left Traingle : Made from INCREASING TRAINGLE OF SPACES and DECREASING TRAINGLE OF STARS

* 3)Hill pattern  : Made from DECREASING TRAINGLE OF SPACES and INCREASING TRAINGLE OF STARS and INCREASING TRAINGLE OF STARS

* 4)Reverse pattern

*/

//All these patterns are made from INCREASING AND DECREASING TRAINGLES

//As u know, we always start printing from the left side of the screen

//So where we see blank , its actually either the  INCREASING or DECREASING TRAINGLE made with spaces.

//Also do note the ROWS are 'n' only

//But columns have different printing options like SPACE or STARS