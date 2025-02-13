package Assignments.InputByUser;

import java.util.Scanner;

 // Write a program to take two integer inputs from user and print sum and product of them.

public class Assignment1 {

        public static void main(String[] args) {
            // Create a Scanner object to read user input
            Scanner scanner = new Scanner(System.in);

            // Prompt the user for the first integer
            System.out.print("Enter the first integer: ");
            int num1 = scanner.nextInt();

            // Prompt the user for the second integer
            System.out.print("Enter the second integer: ");
            int num2 = scanner.nextInt();

            // Calculate the sum and product
            int sum = num1 + num2;
            int product = num1 * num2;

            // Print the sum and product
            System.out.println("Sum: " + sum);
            System.out.println("Product: " + product);

            // Close the scanner
            scanner.close();
        }
    }


