// Author: Adnan Farooq 
// Date and Time: 12 February, 2026 22:46
// Book: Java How to Program, Late Objects, Global Edition
// java 24.0.2 2025-07-15
// Java(TM) SE Runtime Environment (build 24.0.2+12-54)
// Java HotSpot(TM) 64-Bit Server VM (build 24.0.2+12-54, mixed mode, sharing)

import java.util.Scanner;

/**
2.26 (Multiples)  Write an application that reads two integers, determines whether the first num
ber tripled is a multiple of the second number doubled, and prints the result. [Hint: Use the remain
der operator.]
 */
public class ex_2_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 1st Number: ");
        int num1 = input.nextInt();
        System.out.println("Enter 2nd Number: ");
        int num2 = input.nextInt();

        if(((num1 * 3) % (num2 * 2)) == 0){
            System.out.println("Tripled of " + num1 + " is a multiple of doubled of"+ num2);
        }
        else{
            System.out.println("Tripled of " + num1 + " is not a multiple of doubled of"+ num2);
        }
        
    }
}