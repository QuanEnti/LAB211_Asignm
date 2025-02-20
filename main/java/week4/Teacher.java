/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4;

/**
 *
 * @author HP
 */
public class Teacher extends Person{
    private int yearP;
    private String contract;
    private double salary;

    public Teacher() {
        super();
        
        this.yearP = 0;
        this.contract = "";
        this.salary = 0.0;
        
    }
    public void inputAll(int year, String contr, double sala, int id, String fname, String phone, int yearofB, String major){
        super.InputAll(id, fname, phone, yearofB, major);
        yearP = year;
        contract = contr;
        salary = sala;
    }

    @Override
    public String toString() {
        return super.toString() + "Teacher{" + "yearP=" + yearP + ", contract=" + contract + ", salary=" + salary + '}';
    }
    
}
