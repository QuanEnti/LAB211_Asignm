/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mylab211;

import java.util.Scanner;
import week1.ConVertInput;
import week1.CountWC;
import week1.EquationSolver;
import week1.LinearSearch;

/**
 *
 * @author HP
 */
public class MyLab211 {

   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   
       
        System.out.println("Enter number of array:");       
        int n = sc.nextInt();

        LinearSearch li = new LinearSearch(n);
        li.addValue();
        System.out.println("Enter search value:");
        int searchValue = sc.nextInt();
        li.displayArray();
        
        
        
        int fIndex = li.searchValue(searchValue);
        if (fIndex != -1) {
            System.out.println("Found " + searchValue + " at index: " + fIndex);
        } else {
            System.out.println(searchValue + " is not found in the array.");
        }
        
    }
 
  /*   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your content: ");
        String input = sc.nextLine(); 

        CountWC counter = new CountWC(input);
        counter.displayResults();
    }
    */
   /*
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         ConVertInput baseConverter= new ConVertInput();

        while (true) {
            System.out.println("===== BASE CONVERSION PROGRAM =====");
            System.out.println("1. Binary");
            System.out.println("2. Decimal");
            System.out.println("3. Hexadecimal");
            System.out.println("4. Exit");

            System.out.print("Choose input base system (1-3): ");
            int inputBase = scanner.nextInt();
            if (inputBase == 4) {
                System.out.println("Exiting program...");
                break;
            }

            System.out.print("Choose output base system (1-3): ");
            int outputBase = scanner.nextInt();

            System.out.print("Enter value to convert: ");
            String inputValue = scanner.next();

            try {
                String result = baseConverter.convert(inputValue, inputBase, outputBase);
                System.out.println("Converted value: " + result);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please try again.");
            }
            System.out.println();
        }
        scanner.close();
    }
*/
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int choice;
//        EquationSolver equa = new EquationSolver();
//        do {
//            System.out.println("\n====== Main Menu ======");
//            System.out.println("1. Calculate Superlative Equation");
//            System.out.println("2. Calculate Quadratic Equation");
//            System.out.println("3. Exit");
//            System.out.print("Enter your choice: ");
//            choice = scanner.nextInt();
//
//            switch (choice) {
//                case 1:
//                    equa.calculateSuperlativeEquation(scanner);
//                    break;
//                case 2:
//                    equa.calculateQuadraticEquation(scanner);
//                    break;
//                case 3:
//                    System.out.println("Exiting the program. Goodbye!");
//                    break;
//                default:
//                    System.out.println("Invalid choice! Please try again.");
//            }
//        } while (choice != 3);
//
//        scanner.close();
//    }
}
