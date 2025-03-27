/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week6;

import java.util.List;

/**
 *
 * @author HP
 */
public class Worker {
    private String code;
    private String name;
    private int age;
    private List<Salary> salaryhistory;

    public Worker(String code, String name, int age, List<Salary> salaryhistory) {
        this.code = code;
        this.name = name;
        this.age = age;
        this.salaryhistory = salaryhistory;
    }

    @Override
    public String toString() {
        return "Worker{" + "code=" + code + ", name=" + name + ", age=" + age + ", salaryhistory=" + salaryhistory + '}';
    }
    public void addSalary(Salary a){
        salaryhistory.add(a);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Salary> getSalaryhistory() {
        return salaryhistory;
    }

    public void setSalaryhistory(List<Salary> salaryhistory) {
        this.salaryhistory = salaryhistory;
    }
    
}
