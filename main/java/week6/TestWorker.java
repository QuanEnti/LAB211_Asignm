/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class TestWorker {
    static Scanner sc = new Scanner(System.in);
    WorkerManager w = new WorkerManager();
    public static void main(String[] args) {
         TestWorker t = new TestWorker();
        
        int choice;
        do{

            System.out.println("1. Add worker");
            System.out.println("2. Change up salary");
            System.out.println("3. Change down salary");
            System.out.println("4.Information worker");
            System.out.println("5.Exit");
            choice = sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:{
                    t.addWorker();
                    break;
                }
                case 2:{
                    t.changUpSalary();
                    break;
                }
                case 3: {
      
                    t.changDownSalary();
                    break;
                }
                case 4:{
                    t.ShowInformation();
                    break;
                }
                case 5:{
                    break;
                }
            }
            
        }while(choice!=5);
    }
    public void addWorker(){
        System.out.println("Enter code worker");
        String code = sc.nextLine();
        System.out.println("Enter name worker");
        String name = sc.nextLine();
        System.out.println("Enter  age");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter salary");
        double salary = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter status");
        String sta = sc.nextLine();
        System.out.println("Enter date");
        String date = sc.nextLine();
        List<Salary> s = new ArrayList<>();
        Worker t = new Worker(code,name,age, s);
        t.addSalary(new Salary(salary,sta,date));
        w.addWorker(t);
    }
    public void changUpSalary(){
        System.out.println("Enter code to update");
        String code = sc.nextLine();
        System.out.println("Enter the money update");
        double money = sc.nextDouble();
        w.changeUpSalary(code, money);
    }
    public void changDownSalary(){
        System.out.println("Enter code to update");
        String code = sc.nextLine();
        System.out.println("Enter the money update");
        double money = sc.nextDouble();
        w.changeDownSalary(code, money);
    }
    public void ShowInformation(){
        w.getInformationSalary();   
    }
}
