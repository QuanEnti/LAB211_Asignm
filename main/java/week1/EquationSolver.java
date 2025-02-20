/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1;

import java.util.Scanner;

/**
 *
 * @author HP
 */

public class EquationSolver {
    public void calculateSuperlativeEquation(Scanner scanner) {
        System.out.println("\n--- Calculate Superlative Equation ---");
        System.out.print("Enter coefficient A: ");
        double a = scanner.nextDouble();
        System.out.print("Enter coefficient B: ");
        double b = scanner.nextDouble();

        if (a == 0) {
            System.out.println("Invalid input! Coefficient A cannot be 0.");
            return;
        }

        double x = -b / a;
        System.out.printf("The solution is: x = %.2f%n", x);

        displayNumbers(new int[]{(int) a, (int) b});
    }

    public void calculateQuadraticEquation(Scanner scanner) {
        System.out.println("\n--- Calculate Quadratic Equation ---");
        System.out.print("Enter coefficient A: ");
        double a = scanner.nextDouble();
        System.out.print("Enter coefficient B: ");
        double b = scanner.nextDouble();
        System.out.print("Enter coefficient C: ");
        double c = scanner.nextDouble();

        if (a == 0) {
            System.out.println("Invalid input! Coefficient A cannot be 0.");
            return;
        }

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.printf("The solutions are: x1 = %.2f, x2 = %.2f%n", x1, x2);
        } else if (discriminant == 0) {
            double x = -b / (2 * a);
            System.out.printf("The solution is: x = %.2f%n", x);
        } else {
            System.out.println("The equation has no real roots.");
        }

        displayNumbers(new int[]{(int) a, (int) b, (int) c});
    }

    private void displayNumbers(int[] numbers) {
        System.out.println("\nOdd numbers:");
        for (int num : numbers) {
            if (num % 2 != 0) System.out.print(num + " ");
        }
        System.out.println("\nEven numbers:");
        for (int num : numbers) {
            if (num % 2 == 0) System.out.print(num + " ");
        }
        System.out.println("\nSquare numbers:");
        for (int num : numbers) {
            if (isPerfectSquare(num)) System.out.print(num + " ");
        }
        System.out.println();
    }

    private boolean isPerfectSquare(int num) {
        if (num < 0) return false;
        int sqrt = (int) Math.sqrt(num);
        return sqrt * sqrt == num;
    }
}