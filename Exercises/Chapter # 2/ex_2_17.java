// Author: Adnan Farooq 
// Date and Time: 12 February, 2026 01:16
// Book: Java How to Program, Late Objects, Global Edition
// java 24.0.2 2025-07-15
// Java(TM) SE Runtime Environment (build 24.0.2+12-54)
// Java HotSpot(TM) 64-Bit Server VM (build 24.0.2+12-54, mixed mode, sharing)

import java.util.Scanner;

/**
 * 2.17 (Arithmetic, Smallest and Largest) Write an application that inputs three integers from the
user and displays the sum, average, product, smallest and largest of the numbers. Use the techniques
shown in Fig. 2.15. [Note: The calculation of the average in this exercise should result in an integer
representation of the average. So, if the sum of the values is 7, the average should be 2, not 2.3333….]
 */
public class ex_2_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 1st digit :");
        int num1 = input.nextInt();

        System.out.println("Enter 2nd digit :");
        int num2 = input.nextInt();

        System.out.println("Enter 3rd digit :");
        int num3 = input.nextInt();

        int sum = num1 + num2 + num3;
        int avg = (num1 + num2 + num3) / 3 ;
        int prod = num1 * num2 * num3;

        int smallest = 0;
        int largest = 0;

        if(num1 < num2 && num1 < num3){
            smallest = num1;
        }
        else if(num2 < num1 && num2 < num3){
            smallest = num2;
        }
        else if(num3 < num1 && num3 < num2){
            smallest = num3;
        }

        if(num1 > num2 && num1 > num3){
            largest = num1;
        }
        else if(num2 > num1 && num2 > num3){
            largest = num2;
        }
        else if(num3 > num1 && num3 > num2){
            largest = num3;
        }

        System.out.println("Sum :" + sum);
        System.out.println("Product :" + prod);
        System.out.println("Average :" + avg);
        System.out.println("Smallest Number :" + smallest);
        System.out.println("Largest Number :" + largest);

    }
}