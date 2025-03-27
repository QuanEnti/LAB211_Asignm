/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5;


import java.util.List;
import java.util.Scanner;


/**
 *
 * @author HP
 */
public class Week5 {
    static Scanner sc = new Scanner(System.in);
    CourseManagement cManage = new CourseManagement();
    public static void main(String[] args) {
        Week5 w = new Week5();
        
        int choice;
        do{
            System.out.println("1. Addcourse");
            System.out.println("2. Delete course");
            System.out.println("3. Update course");
            System.out.println("4. Search course");
            System.out.println("5.Exit");
            choice = sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:{
                    w.addOnlineCourse();
                    w.addOnfflineCourse();
                    break;
                }
                case 2:{
                    w.deleteCourse();
                    break;
                }
                case 3: {
                    w.updateCourse();
                    break;
                }
                case 4:{
                    w.searchCourse();
                }
                case 5:{
                    break;
                }
            }
            
        }while(choice!=5);
        
    }
    public void addOnlineCourse(){
        System.out.println("Enter course id");
        String id = sc.nextLine();
        System.out.println("Enter course name");
        String name = sc.nextLine();
        System.out.println("");
        System.out.println("Enter credit");
        int cre = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter plashform");
        String plash = sc.nextLine();
        System.out.println("Enter instructor");
        String in = sc.nextLine();
        System.out.println("Enter node");
        String node = sc.nextLine();
        OnlineCourse on = new OnlineCourse();
        on.inputAll(plash, in, node, name, id, cre);
        if(cManage.addOnlineCourse(on)){
            System.out.println("Add online course successfully");
        }else{
            System.out.println("Not successfully");
        } 
    }
     public void addOnfflineCourse(){
        System.out.println("Enter course id");
        String id = sc.nextLine();
        System.out.println("Enter course name");
        String name = sc.nextLine();
        System.out.println("");
        System.out.println("Enter credit");
        int cre = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter begin");
        String begin = sc.nextLine();
        System.out.println("Enter end");
        String end = sc.nextLine();
        System.out.println("Enter campus");
        String campus = sc.nextLine();
        OfflineCourse off = new OfflineCourse();
        off.inputAll(begin, end, campus, name, id, cre);
        if(cManage.addOfflineCourse(off)){
            System.out.println("Add offline course successfully");
        }else{
            System.out.println("Not successfully");
        } 
    }
     public void deleteCourse(){
         System.out.println("enter id course");
         String idCourse = sc.nextLine();
         System.out.println("Enter your choice to delete(1.Online / 2. Offline)");
         
         int choice = DataInput.ChoiceInput();
         while(true){
             try{
                 
                 choice = Integer.parseInt(sc.nextLine());
                 if(choice == 1 || choice == 2){
                     break;
                 }else{
                     System.out.println("Eror");
                 }
             }catch(Exception e){
                 System.out.println("Please enter again(1 or 2)");
             }
         }
         if(choice == 1){
            if(cManage.deleteOnlineCourse(idCourse)){
                System.out.println("Successfully");
            }else{
                System.out.println("Not successfully");
            }
         }else{
             if(cManage.deleteOfflineCourse(idCourse)){
                System.out.println("Delete Successfully");
            }else{
                System.out.println("Not successfully");
            }
         } 
     }
     public void updateCourse(){
         System.out.println("Enter id to update");
         String id = sc.nextLine();
         System.out.println("New name");
         String name = sc.nextLine();
         System.out.println("New stc");
         int stc = sc.nextInt();
         sc.nextLine();
         System.out.println("enter id course");
         String idCourse = sc.nextLine();
         System.out.println("Enter your choice to update(1.Online / 2. Offline)");
         int choice;
         while(true){
             try{
                 
                 choice = Integer.parseInt(sc.nextLine());
                 if(choice == 1 || choice == 2){
                     break;
                 }else{
                     System.out.println("Eror");
                 }
             }catch(Exception e){
                 System.out.println("Please enter again(1 or 2)");
             }
         }
         if(choice == 1){
             if(cManage.updateOnlineCourse(id, name, stc)){
                System.out.println("Update Online Course Successfull");
            }else{
                System.out.println("Not successfully");
            }
         }else{
             if(cManage.updateOfflineCourse(id, name, stc)){
                System.out.println("Update Offline Course Successfull");
            }else{
                System.out.println("Not successfully");
            }
         }
     }
    public void searchCourse(){
        System.out.println("Enter course name to search");
        String name = sc.nextLine();
        System.out.println("Enter your choice to search(1.Online / 2. Offline)");
        int choice;
         while(true){
             try{
                 
                 choice = Integer.parseInt(sc.nextLine());
                 if(choice == 1 || choice == 2){
                     break;
                 }else{
                     System.out.println("Eror");
                 }
             }catch(Exception e){
                 System.out.println("Please enter again(1 or 2)");
             }
         }
        List<OnlineCourse> on = cManage.searchOnlineCoure(name);
        List<OfflineCourse> off = cManage.searchOfflineCoure(name);
        if(choice == 1){
             if (on!= null && !on.isEmpty()) {
                System.out.println("Search results:");
                for (OnlineCourse c : on) {
                    System.out.println(c);
                }
            } else {
                System.out.println("No student found.");
            }
        }else{
             if (on!= null && !on.isEmpty()) {
                System.out.println("Search results:");
                for (OfflineCourse c : off) {
                    System.out.println(c);
                }
            } else {
                System.out.println("No student found.");
            }
        }
    }
    public void printCourse(){
        System.out.println("Enter your choice to print(1.Online / 2. Offline)");
        int choice;
         while(true){
             try{
                 
                 choice = Integer.parseInt(sc.nextLine());
                 if(choice == 1 || choice == 2){
                     break;
                 }else{
                     System.out.println("Eror");
                 }
             }catch(Exception e){
                 System.out.println("Please enter again(1 or 2)");
             }
         }
        if(choice == 1){
            cManage.printOnlineCourse();
        }else{
            cManage.getOfflinecourslist();
        }
    }

}
