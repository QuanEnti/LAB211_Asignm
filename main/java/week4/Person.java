/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4;

/**
 *
 * @author HP
 */
public class Person {
    private int Id;
    private String fullName;
    private String phoneNumber;
    private int yearofbirth;
    private String major;
    
    public Person(){
        Id = 0;
        fullName="";
        phoneNumber= "";
        yearofbirth= 0;
        major = "";
    }
    
    public void InputAll(int id, String name, String phonenumber, int yearofbirth, String major){
        Id = id;
        this.fullName = name;
        this.phoneNumber = phonenumber;
        this.yearofbirth = yearofbirth;
        this.major = major;
    }

    @Override
    public String toString() {
        return "Person{" + "Id=" + Id + ", fullName=" + fullName + ", phoneNumber=" + phoneNumber + ", yearofbirth=" + yearofbirth + ", major=" + major + '}';
    }

    
    
}
