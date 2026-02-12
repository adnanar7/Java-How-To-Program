// Author: Adnan Farooq 
// Date and Time: 11 February, 2026 21:24
// Book: Java How to Program, Late Objects, Global Edition
// java 24.0.2 2025-07-15
// Java(TM) SE Runtime Environment (build 24.0.2+12-54)
// Java HotSpot(TM) 64-Bit Server VM (build 24.0.2+12-54, mixed mode, sharing)

import java.util.Scanner;

/**
2.15 (Arithmetic) Write an application that asks the user to enter two integers, obtains them
from the user and prints the square of each, the sum of their squares, and the difference of the squares
(first number squared minus the second number squared). Use the techniques shown in Fig. 2.7.

 */
public class ex_2_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 1st Integer: ");
        int num1 = input.nextInt();

        System.out.println("Enter 2nd Integer: ");
        int num2 = input.nextInt();

        int num1_sq = num1 * num1;
        int num2_sq = num2 * num2;

        int sum_sq = num1_sq + num2_sq;

        System.out.println("Square of "+ num1 +" is : " +  num1_sq);
        System.out.println("Square of " + num2 +" is : " +  num2_sq);
        System.out.println("Sum of the Squares of " + num1 +" and " + num2 + " is : "+ sum_sq);

        System.out.println("Difference of squares is : " + (num1_sq - num2_sq));
    

    }
}