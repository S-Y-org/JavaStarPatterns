package com.StarPatterns;

/*public class HillPattern {
    public static void main(String[] args) {
        int n =5;
        for (int i = 1 ; i <= n ; i++){
            for (int j = i ; j<=n ; j++){ //decreasing traingle
                System.out.print("  "); //Here the print statement will print space only
            }
            for (int j = 1 ; j <= i ; j++){ //increasing traingle
                System.out.print("* "); //This will print stars
            }
            for (int j = 1 ; j <= i ; j++){
                System.out.print("* ");
            }
            System.out.println(); //after printing one row, come to the next row
        }
    }
}*/

/*Here when u get the output , you will see there is no peak*/

//When u print one less column , u will get a peak

public class HillPattern {
    public static void main(String[] args) {
        int n =5;
        for (int i = 1 ; i <= n ; i++){
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
    }
}