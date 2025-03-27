/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week6;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class WorkerManager {
    private List<Worker> wList = new ArrayList<>();
    private List<Salary> sList = new ArrayList<>();
    
    public void addWorker(Worker worker){
        wList.add(worker);
    }

    public void changeUpSalary(String code, double money){
        for(Worker w : wList){
            if(w.getCode().equals(code)){
                w.addSalary(new Salary(money,"UP", java.time.LocalDate.now().toString()));
            }        
        }
    }
    public void changeDownSalary(String code, double money){
        for(Worker w : wList){
            if(w.getCode().equals(code)){
                w.addSalary(new Salary(money,"DOWN", java.time.LocalDate.now().toString()));
            }        
        }
    }
//    public List<Worker> getInfomationSalary(){
//        Collections.sort(wList, new Comparator<Worker>() {
//            public int compare(Worker c1, Worker c2) {
//                return c1.getCode().compareTo(c2.getCode());
//            }
//        });
//        return wList;
//    }
    
    public void getInformationSalary(){
        for(Worker x : wList){
            String tem = x.toString();
            for(Salary s : x.getSalaryhistory()){
                System.out.println(tem + s.toString());
            }
        }
    }
    
}
