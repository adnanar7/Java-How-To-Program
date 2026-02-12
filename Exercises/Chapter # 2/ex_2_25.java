
import java.util.Scanner;

// Author: Adnan Farooq 
// Date and Time: 12 February, 2026 21:49
// Book: Java How to Program, Late Objects, Global Edition
// java 24.0.2 2025-07-15
// Java(TM) SE Runtime Environment (build 24.0.2+12-54)
// Java HotSpot(TM) 64-Bit Server VM (build 24.0.2+12-54, mixed mode, sharing)

/**
2.25 (Divisible by 3)  Write an application that reads an integer and determines and prints
whether it’s divisible by 3 or not. [Hint: Use the remainder operator. A number is divisible by 3 if
it’s divided by 3 with a remainder of 0.]
 */
public class ex_2_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the Number: ");
        int num = input.nextInt();

        if(num % 3 == 0){
            System.out.println(num + " is divisible by 3.");
        }
        else{
            System.out.println(num + " is not divisible by 3.");
        }
    }
}