/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week6;

/**
 *
 * @author HP
 */
public class Contact {
    private int id;
    private String name;
    private String fName;
    private String lastName;
    
    private String group;
    private String address;
    private String phone;

    public Contact(int id, String name, String fName, String lastName, String group, String address, String phone) {
        this.id = id;
        this.name = name;
        this.fName = fName;
        this.lastName = lastName;
        this.group = group;
        this.address = address;
        this.phone = phone;
    }

    

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "id=" + id + ", name=" + name + ", fName=" + fName + ", lastName=" + lastName + ", group=" + group + ", address=" + address + ", phone=" + phone     ;
    }

    
   
}
