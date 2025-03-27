/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author HP
 */
public class ContactManage {
    List<Contact> cList = new ArrayList<>();
    public boolean addConTact(Contact contact){
        cList.add(contact); 
        return true;
    }
    public void displayAll(){
        for(Contact c : cList){
            System.out.println(c.toString());
        }
    }
    public boolean deleteContact(int id){
        Iterator<Contact> iterator = cList.iterator();
        while(iterator.hasNext()){
            Contact c = iterator.next();
            if(c.getId() == id){
                iterator.remove();
                return true;
            }   
        }
        return false;
    }
    
    
    
}
