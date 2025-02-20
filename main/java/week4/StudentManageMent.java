/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4;


import java.util.List;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class StudentManageMent {
    static Scanner sc = new Scanner(System.in);
    StudentList sList = new StudentList();
    public static void main(String[] args) {
        StudentManageMent st = new StudentManageMent();
        int choice;
        do{
            System.out.println("1. Create student");
            System.out.println("2. Find and sort student by name");
            System.out.println("3. Update and delete student by ID");
            System.out.println("4. Report");
            System.out.println("5.Exit");
            choice = sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:{
                    st.addStudent();
                    break;
                }
                case 2:{
                    
                    
                    
                }
                
            }
            
        }while(choice!=5);
        
    }
    public void sortStudent(){
        System.out.println("Sort students:");
        sList.sortStudents();
        sList.showStudent();
    }
    public void addStudent(){
        System.out.println("Student ID");
        String id = sc.nextLine();
        System.out.println("Student Name");
        String name = sc.nextLine();
        System.out.println("Student CourseName");
        String courseName = sc.nextLine();
        System.out.println("Semester");
        String Semester = sc.nextLine();
        Student stu = new Student(id,name,Semester,courseName);
        
        if(sList.addStudent(stu)){
            System.out.println("Add successfully");
        }else {
        System.out.println("Error: Unable to add student.");
        }
    }
    public void findStudent(){
        System.out.println("Enter name to find");
        String name = sc.nextLine();
        List<Student> student = sList.findStudent(name);
        if (student != null && !student.isEmpty()) {
                System.out.println("Search results:");
                for (Student c : student) {
                    System.out.println(c);
                }
            } else {
                System.out.println("No student found.");
            }
    }
    public void updateStudent(){
        System.out.println("Enter id to update");
        String id = sc.nextLine();
        boolean found = false;
        for(Student st : sList.getStudentList()){
            if(st.getId().equals(id));
            sList.updateStudent(st, id);
            System.out.println("Update successfully");
        }
        if (!found) {
            System.out.println("Error: Student with the given ID not found");  
        }
    }
    public void deleteStudent(){
        System.out.println("Enter id to delete");
        String id = sc.nextLine();
        if(sList.deleteStudent(id)){
            System.out.println("Delete successfully");
        }else{
            System.out.println("Error");
        }
    }
    public void report(){
        sList.reportStudents();
    }
}
