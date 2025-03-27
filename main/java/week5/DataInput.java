/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class DataInput {
    static Scanner sc = new Scanner(System.in);
    public static int ChoiceInput(){
         while(true){
             try{
                 
                 int choice = Integer.parseInt(sc.nextLine());
                 if(choice == 1 || choice == 2)
                     throw new IllegalArgumentException("error");
                     return choice;                 
             }catch(Exception e){
                 System.out.println("Please enter again(1 or 2)");
             }
         }
    }
}
