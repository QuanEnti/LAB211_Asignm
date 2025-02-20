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
public class Matrix {
    private int rows;
    private int columns;
    private int[][] data;


    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        data = new int[rows][columns];
    }


    public void inputMatrix(Scanner scanner) {
        System.out.println("Enter values for the matrix (" + rows + "x" + columns + "):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                while (true) {
                    try {
                        System.out.print("Element [" + i + "][" + j + "]: ");
                        data[i][j] = Integer.parseInt(scanner.nextLine());
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("The value must be an integer. Please try again.");
                    }
                }
            }
        }
    }


    public void displayMatrix() {
        for (int[] row : data) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }


    public Matrix additionMatrix(Matrix matrix2) {
        if (this.rows != matrix2.rows || this.columns != matrix2.columns) {
            throw new IllegalArgumentException("Both matrices must have the same size for addition.");
        }
        Matrix result = new Matrix(rows, columns);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result.data[i][j] = this.data[i][j] + matrix2.data[i][j];
            }
        }
        return result;
    }


    public Matrix subtractionMatrix(Matrix matrix2) {
        if (this.rows != matrix2.rows || this.columns != matrix2.columns) {
            throw new IllegalArgumentException("Both matrices must have the same size for subtraction.");
        }
        Matrix result = new Matrix(rows, columns);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result.data[i][j] = this.data[i][j] - matrix2.data[i][j];
            }
        }
        return result;
    }

    public Matrix multiplicationMatrix(Matrix matrix2) {
        if (this.columns != matrix2.rows) {
            throw new IllegalArgumentException("The number of columns of the first matrix must match the number of rows of the second matrix.");
        }
        Matrix result = new Matrix(this.rows, matrix2.columns);
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < matrix2.columns; j++) {
                result.data[i][j] = 0;
                for (int k = 0; k < this.columns; k++) {
                    result.data[i][j] += this.data[i][k] * matrix2.data[k][j];
                }
            }
        }
        return result;
    }
}
