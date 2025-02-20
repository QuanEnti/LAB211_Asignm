/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1;


/**
 *
 * @author HP
 */
public class ConVertInput {
    private int base;
    private String value;

    public ConVertInput() {
    }
    
    public ConVertInput(int base, String value) {
        this.base = base;
        this.value = value;
        validate();
    }
     private void validate() {
        try {
            Integer.parseInt(value, base);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Invalid number format for base " + base);
        }
    }
    public String convertTo(int targetBase) {
        int decimalValue = Integer.parseInt(value, base); 
        return Integer.toString(decimalValue, targetBase);
    }
    public String convert(String value, int inputBase, int outputBase) {
        ConVertInput cv = new ConVertInput(getBase(inputBase), value);
        return cv.convertTo(getBase(outputBase));
    }
     private int getBase(int choice) {
        switch (choice) {
            case 1:
                return 2; 
            case 2:
                return 10; 
            case 3:
                return 16;
            default:
                throw new IllegalArgumentException("Invalid base choice!");
        }
    }
}
