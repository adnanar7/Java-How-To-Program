// Author: Adnan Farooq 
// Date and Time: 11 February, 2026 21:24
// Book: Java How to Program, Late Objects, Global Edition
// java 24.0.2 2025-07-15
// Java(TM) SE Runtime Environment (build 24.0.2+12-54)
// Java HotSpot(TM) 64-Bit Server VM (build 24.0.2+12-54, mixed mode, sharing)

import java.util.Scanner;

/**
 * 2.15 (Arithmetic) Write an application that asks the user to enter two integers, obtains them
from the user and prints their sum, product, difference and quotient (division). Use the techniques
shown in Fig. 2.7.

 */
public class ex_2_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 1st Integer: ");
        int num1 = input.nextInt();

        System.out.println("Enter 2nd Integer: ");
        int num2 = input.nextInt();

        int sum = num1 + num2;
        int diff = num1 - num2;
        int prod = num1 * num2;
        int div = num1 / num2;

        System.out.println("Sum is " + sum);
        System.out.println("Difference is " + diff);
        System.out.println("Product  is " + prod);
        System.out.println("Division is " + div);
    }
}