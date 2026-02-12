// Author: Adnan Farooq 
// Date and Time: 12 February, 2026 01:04
// Book: Java How to Program, Late Objects, Global Edition
// java 24.0.2 2025-07-15
// Java(TM) SE Runtime Environment (build 24.0.2+12-54)
// Java HotSpot(TM) 64-Bit Server VM (build 24.0.2+12-54, mixed mode, sharing)

import java.util.Scanner;

/**
 * 2.16 (Comparing Integers)  Write an application that asks the user to enter one integer, obtains
it from the user and displays whether the number and its square are greater than, equal to, not equal
to, or less than the number 100. Use the techniques shown in Fig. 2.15.
 */
public class ex_2_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Number :");
        int num = input.nextInt();

        int square_of_num = num * num;

        if(num<100){
            System.out.printf("%d is less than the 100.\n",num);
        }
        else if(num>100){
            System.out.printf("%d is greater than 100.\n",num);
        }
        else{
            System.out.printf("%d is equal to 100.\n",num);
        }

        if(square_of_num < 100){
            System.out.printf("%d is less than the 100.\n",square_of_num);

        }
        else if(square_of_num > 100){
            System.out.printf("%d is greater than 100.\n",square_of_num);
        }
        else{
            System.out.printf("%s is equal to 100.\n",square_of_num);
        }
    }
}