/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class StudentList{
    private List<Student> StudentList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public List<Student> getStudentList() {
        return StudentList;
    }
    
    
    public boolean checkStudent(Student st){
        if(StudentList.size() > 3){
            System.out.println("Do you want to continue(Y/N(Choose y to continue and N to return))");
            String t = sc.nextLine().trim();
            return t.equalsIgnoreCase("Y");
            
        }
        return true;
    }
    public boolean addStudent(Student st){
        if(!checkStudent(st)){
            return false;
        }
        StudentList.add(st);
        return true;
    }
    public void showStudent(){
        for(Student st : StudentList){
            System.out.println(st.toString());
        }
        }
    public List<Student> findStudent(String name){
        List<Student> result = new ArrayList<>();
        for(Student st : StudentList){
            if(st.getStudentName().contentEquals(name)){
                result.add(st);
            }
        }
        return result;
    }
    public boolean deleteStudent(String id) {
    Iterator<Student> iterator = StudentList.iterator();
    while (iterator.hasNext()) {
        Student st = iterator.next();
        if (st.getId().equals(id)) {
            iterator.remove();
            return true;
        }
    }
    return false;
}
    public void updateStudent(Student st, String id){
        st.setId(id);
    }
    public void sortStudents(){
        Collections.sort(StudentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getStudentName().compareTo(o2.getStudentName());
            }
        });
        
    }
    public void reportStudents(){
        Map<String, Integer> ds = new HashMap<>();
        for(Student st : StudentList){
            
            String key = st.getId() + "|" + st.getStudentName() + "|" + st.getCourseName();
            ds.put(key, ds.getOrDefault(key,0)+1);
        }
        for(Map.Entry<String, Integer> infor: ds.entrySet()){
            System.out.println(infor.getKey()+ "|" + infor.getValue());
        }
    }
    sc.close();
}
