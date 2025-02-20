/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class MatrixCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Add two matrices");
            System.out.println("2. Subtract two matrices");
            System.out.println("3. Multiply two matrices");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = Integer.parseInt(scanner.nextLine());

            if (choice == 4) {
                System.out.println("Program terminated.");
                break;
            }

            System.out.print("Enter the number of rows for the matrix: ");
            int rows = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter the number of columns for the matrix: ");
            int columns = Integer.parseInt(scanner.nextLine());

            Matrix matrix1 = new Matrix(rows, columns);
            matrix1.inputMatrix(scanner);

            Matrix matrix2 = new Matrix(rows, columns);
            matrix2.inputMatrix(scanner);

            Matrix result;
            try {
                switch (choice) {
                    case 1:
                        result = matrix1.additionMatrix(matrix2);
                        System.out.println("Result of addition:");
                        result.displayMatrix();
                        break;
                    case 2:
                        result = matrix1.subtractionMatrix(matrix2);
                        System.out.println("Result of subtraction:");
                        result.displayMatrix();
                        break;
                    case 3:
                        System.out.print("Enter the number of rows for the second matrix: ");
                        int rows2 = Integer.parseInt(scanner.nextLine());
                        System.out.print("Enter the number of columns for the second matrix: ");
                        int columns2 = Integer.parseInt(scanner.nextLine());

                        Matrix matrix3 = new Matrix(rows2, columns2);
                        matrix3.inputMatrix(scanner);

                        result = matrix1.multiplicationMatrix(matrix3);
                        System.out.println("Result of multiplication:");
                        result.displayMatrix();
                        break;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
