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
public class Operator {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Normal Calculator");
            System.out.println("2. BMI Calculator");;
            System.out.println("3. Exit");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    Operator.doCalculator(sc);
                    break;
                case 2:
                    Operator.bmiCalculator(sc);
                    break;
                case 3:
                    System.out.println("Exiting program. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);
    }
     static void bmiCalculator(Scanner scanner) {

        System.out.print("Enter weight (kg): ");
        double weight = getValidNumber(scanner);

        System.out.print("Enter height (cm): ");
        double height = getValidNumber(scanner) / 100;
        BMIcalculator bm = new BMIcalculator(weight,height);
        double bmi = bm.calculateBMI();
        System.out.printf("BMI Number: %.2f%n", bmi);

        String status = bm.getBMIStatus(bmi);
        System.out.println("BMI Status: " + status);
    }

    static void doCalculator(Scanner scanner){
        normalCalculator cal = new normalCalculator();
        System.out.println("input number:");
        double so = getValidNumber(scanner);
        double temp = so;

        while(true){
            System.out.print("Input operator: ");
            String op =checkOperator(scanner);
            if(op.equals("=")){
                System.out.println("Final result:" + temp);
                return;
            }
            System.out.println("input number:");
            so = Double.parseDouble(scanner.next());
            scanner.nextLine();
            temp = cal.calculate(temp, op, so);
            System.out.println("Caculater = " + temp);
        }
    }
     private static double getValidNumber(Scanner scanner) {
        while (true) {
            try {
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Please enter a number: ");
            }
        }
    }

    private static String checkOperator(Scanner scanner) {
      while (true) {
            String operator = scanner.nextLine().trim(); 
            if (operator.matches("[+\\-*/^=]")) { 
                return operator;
            } else {
              System.out.println("Invalid operator. Please input one of (+, -, *, /, ^, =).");
            }
        }
    }
}