package factorialcalculator;

import java.util.Scanner;

public class FactorialCalculator {

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);
        String choice;
         
        do {
            System.out.print("Enter a number to calculate its factorial: ");
            int number = scanner.nextInt();

            if (number < 0) {
                System.out.println("Factorial is not defined for negative numbers");
            } else {
                int result = factorial(number);
                System.out.println("The factorial of " + number + " is " + result);
            }

            System.out.print("Do you want to calculate another factorial? (yes/no): ");
            choice = scanner.next().toLowerCase();

        } while (choice.equals("yes"));

        System.out.println("Thank you for using the factorial calculator!");
        scanner.close();
    }
}
