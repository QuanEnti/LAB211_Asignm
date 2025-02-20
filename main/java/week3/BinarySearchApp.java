/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class BinarySearchApp {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        System.out.print("Enter the minimum value for random numbers: ");
        int min = scanner.nextInt();

        System.out.print("Enter the maximum value for random numbers: ");
        int max = scanner.nextInt();
        
        BinarySearch binarySearch = new BinarySearch(size, min, max);
        
        System.out.println("Sorted array: " + Arrays.toString(binarySearch.getArray()));
        
        System.out.print("Enter the number to search: ");
        int target = scanner.nextInt();
        
        int index = binarySearch.search(target);
        
        if (index != -1) {
            System.out.println("Number found at index: " + index);
        } else {
            System.out.println("Number not found in the array.");
        }
    }
}