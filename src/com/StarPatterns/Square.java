package com.StarPatterns;

public class Square {
    public static void main(String[] args) {
        int n =5;
        for (int i = 1 ; i <= n ; i++){
            for (int j = 1 ; j <= n ; j++){
                System.out.print("* "); //add a extra space to the * , otherwise output will look like a rectangle
            }
            System.out.println(); //after printing one row, come to the next row
        }

    }
}

//OUTPUT
        /*

            * * * * *
            * * * * *
            * * * * *
            * * * * *
            * * * * *

         */













///////////////////////////////////////////////////////////////////////////////////////////////////////

//NOTE//

/*Any complex pattern is drawn using the 2 basic patterns
1)INCREASING TRAINGLE
2)DECREASING TRAINGLE

-Priniting can be done with either a '*', '#', '$' or a number

//Printing Basics

1)When we print , we do it Row by Row
2)Printing always starts from the Left side of the screen
3)If u see a Star is printed away from the left side, its actually done by printing SPACES
4)Cannot move to a Previous Row
5)So Before going to the next Row, we have to print whatever we have in the 1st Row, in the 1st Row itself


//Things to Consider
1)SIZE : How many Rows you want in the pattern

*For this u could either be asked to take a user input for the size OR just pass the size as a Parameter


2)Putting together nested loops

* OUTER LOOP  DETERMINES THE ROWS
*INNER LOOP DETERMINES THE COLUMNS



*/