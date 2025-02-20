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
public class ShapeCalculator {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=====Calculator Shape Program=====");
        System.out.print("Please input side width of Rectangle: ");
        double width = scanner.nextDouble();
        System.out.print("Please input length of Rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Please input radius of Circle: ");
        double radius = scanner.nextDouble();

        System.out.print("Please input side A of Triangle: ");
        double sideA = scanner.nextDouble();
        System.out.print("Please input side B of Triangle: ");
        double sideB = scanner.nextDouble();
        System.out.print("Please input side C of Triangle: ");
        double sideC = scanner.nextDouble();

        Rectangle rectangle = new Rectangle(width, length);
        Circle circle = new Circle(radius);
        Triangle triangle = new Triangle(sideA, sideB, sideC);

        rectangle.printResult();
        circle.printResult();
        triangle.printResult();

        scanner.close();
    }
}
