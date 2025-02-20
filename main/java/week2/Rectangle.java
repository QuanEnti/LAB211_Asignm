/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2;

/**
 *
 * @author HP
 */
public class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getPerimeter() {
        return 2 * (width + length);
    }

    public double getArea() {
        return width * length;
    }

    public void printResult() {
        System.out.println("-----Rectangle-----");
        System.out.printf("Width: %.1f\nLength: %.1f\nArea: %.1f\nPerimeter: %.1f\n", width, length, getArea(), getPerimeter());
    }
}
