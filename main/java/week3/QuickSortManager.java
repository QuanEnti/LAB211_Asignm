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
public class QuickSortManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number of array: ");
        int size = scanner.nextInt();
        
        System.out.print("Enter minimum value: ");
        int minValue = scanner.nextInt();
        
        System.out.print("Enter maximum value: ");
        int maxValue = scanner.nextInt();
        
        QuickSort quickSortManager = new QuickSort(size, minValue, maxValue);
        
        System.out.println("Unsorted array:");
        quickSortManager.displayArray();
        
        quickSortManager.sort();
        
        System.out.println("Sorted array:");
        quickSortManager.displayArray();
    }
}