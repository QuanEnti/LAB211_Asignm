/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3not;

import java.util.Scanner;
import week3.BinarySearch;

/**
 *
 * @author HP
 */
public class week3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of array: ");
        int size = Utilizer.checkNumber();
        System.out.print("Enter the max number of random: ");
        int maxValue = sc.nextInt();
        ArrayManager arrayManager = new ArrayManager(size, maxValue);
        
        //BubbleSort
        System.out.println("Unsorted array:");
        arrayManager.displayArray();

        arrayManager.bubbleSort();

        System.out.println("Sorted aray:");
        arrayManager.displayArray();
        
        //QuickSort8
//        System.out.println("Unsorted array:");
//        arrayManager.displayArray();
//
//        arrayManager.quickSort();
//
//        System.out.println("Sorted aray:");
//        arrayManager.displayArray();
//      
//        //Binary search
//
//        System.out.println("Enter a number to search: ");
//        int target = Utilizer.checkNumber();
//        
//        int index = arrayManager.BinarySearch(target);
//        
//        if (index != -1) {
//            System.out.println("Number found at index: " + index);
//        } else {
//            System.out.println("Number not found in the array.");
//        }
     }
}
