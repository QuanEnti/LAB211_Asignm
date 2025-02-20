/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3not;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Utilizer {
    static Scanner sc = new Scanner(System.in);
    public static int checkNumber(){
        while(true){
            try{
                int input = Integer.parseInt(sc.nextLine());
                if(input<2)
                    throw new IllegalArgumentException("error");
                return input;
            }catch(Exception e){
                System.out.println("error: ");
            }
        }
    }
}
