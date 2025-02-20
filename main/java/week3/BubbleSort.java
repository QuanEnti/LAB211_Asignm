/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class BubbleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of array ");
        int size;
        while (true) {
            while (!scanner.hasNextInt()) {
                System.out.print("Please enter positive integer: ");
                scanner.next();
            }
            size = scanner.nextInt();
            if (size > 0) break;
            System.out.print("Number > 0. Enter again ");
        }

        System.out.print("Enter the max number of random: ");
        int maxValue = scanner.nextInt();

        ArrayManager arrayManager = new ArrayManager(size, maxValue);

        System.out.println("Unsorted array:");
        arrayManager.displayArray();

        arrayManager.bubbleSort();

        System.out.println("Sorted aray:");
        arrayManager.displayArray();

    }
}