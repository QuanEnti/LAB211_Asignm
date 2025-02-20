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
public class normalCalculator {
    String memory;

    public normalCalculator() {
    }
    
    public normalCalculator(String memory) {
        this.memory = memory;
    }
    public double calculate(double a, String operator, double b){
        switch(operator){
            case "+" ->{
                return a+b;
            }
            case "-" ->{
                return a-b;
            }
            case "/"->{
                return a/b;
            }
            case "*"->{
                return a*b;
            }
            default -> throw new IllegalArgumentException("exception: " + operator);
        }
    }

   

   
   
    
}
    
