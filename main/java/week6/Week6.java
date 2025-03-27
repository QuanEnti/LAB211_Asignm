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
public class Week6 {
    static Scanner sc = new Scanner(System.in);
    
    //contact
    ContactManage conList = new ContactManage();
    public static void main(String[] args) {
         Week6 w = new Week6();
        
        int choice;
        do{
            System.out.println("1. Add contact");
            System.out.println("2. Display all contact");
            System.out.println("3. Delete a contact");
            System.out.println("4.Exit");
            choice = sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:{
                    w.addContact();
                    break;
                }
                case 2:{
                    w.displayContact();
                    break;
                }
                case 3: {
      
                    w.deleteContact();
                    break;
                }
                case 4:{
                    break;
                }
            }
            
        }while(choice!=4);
    }
    public void addContact(){
        System.out.println("Enter Id");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter name contact");
        String name = sc.nextLine();
        System.out.println("Enter first name");
        String fName = sc.nextLine();
        System.out.println("Enter last name");
        String lName = sc.nextLine();
        System.out.println("Enter group");
        String group = sc.nextLine();
        System.out.println("Enter address");
        String address = sc.nextLine();
        System.out.println("Enter phone number");
        String phone = DataInput.getValidPhoneNumber();
        Contact ct  = new Contact(id,name,fName,lName,group,address,phone);
        if(conList.addConTact(ct)){
            System.out.println("Add successfully");
        }else{
            System.out.println("No successsfully");
        }
    }
    public void deleteContact(){
        
        System.out.println("Nhap id can xoa");
        
        int id = DataInput.checkId();
        if(conList.deleteContact(id)){
            System.out.println("Delete successfully");
        }else{
            System.out.println("No successfully");
        }
    }
    public void displayContact(){
        System.out.println("All contact");
        conList.displayAll();
    }
}
