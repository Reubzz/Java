// Any one switch case program
// greatest of three numbers 
// Find the determinant Quadratic Root 
// Read a number and find its square root
// Find GCD and LCM 

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int num1, num2, num3, greatest;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number 1: ");
        num1 = sc.nextInt();
        System.out.println("Enter Number 2: ");
        num2 = sc.nextInt();
        System.out.println("Enter Number 3: ");
        num3 = sc.nextInt();

        greatest = num1;
        if (num2 > greatest)
            greatest = num2;
        if (num3 > greatest)
            greatest = num3;

        System.out.println("\nThe greatest number is - " + greatest);

    }
}
