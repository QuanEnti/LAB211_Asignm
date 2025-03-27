/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week6;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class DataInput {
    static Scanner sc = new Scanner(System.in);
    public static int checkId(){
        while(true){
            
            try{
                String id = sc.nextLine();
                if(id == null || id.trim().isEmpty()){
                    throw new IllegalArgumentException("Error id is not null");       
                }
                int number = Integer.parseInt(id);
                if(number<=0){
                    throw new IllegalArgumentException("Error id is not number");  
                }
                return number;
            }catch(IllegalArgumentException e){
                System.out.println("Error id is not null");
            }catch(Exception e){
                System.out.println("Error id is not number");
            }
        }
    }
    public static String getValidPhoneNumber() {
    String phone;

    while (true) {
        try {
            System.out.print("Nhập số điện thoại: ");
            phone = sc.nextLine();

            if (phone == null || phone.trim().isEmpty()) {
                throw new IllegalArgumentException("Error");
            }

            if (!phone.matches("0\\d{9,10}")) {
                throw new IllegalArgumentException("Error . Phone must 10 number");
            }

            return phone;

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
}
