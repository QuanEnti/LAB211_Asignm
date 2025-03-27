/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week6;

/**
 *
 * @author HP
 */
public class Salary {
    private double salary;
    private String statux;
    private String date;

    public Salary(double salary, String statux, String date) {
        this.salary = salary;
        this.statux = statux;
        this.date = date;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getStatux() {
        return statux;
    }

    public void setStatux(String statux) {
        this.statux = statux;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Salary{" + "salary=" + salary + ", statux=" + statux + ", date=" + date + '}';
    }
    
}
