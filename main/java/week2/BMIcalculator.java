/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2;

/**
 *
 * @author HP
 */
public class BMIcalculator {
    double weight;
    double height;

    public BMIcalculator(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }
    public double calculateBMI() {
        return weight / (height * height); 
    }
    public String getBMIStatus(double bmi) {
        if (bmi < 19) {
            return "Under-standard";
        } else if (bmi < 25) {
            return "Standard";
        } else if (bmi < 30) {
            return "Overweight";
        } else if (bmi < 40) {
            return "Fat - should lose weight";
        } else {
            return "Very fat - should lose weight immediately";
        }
    }
}
