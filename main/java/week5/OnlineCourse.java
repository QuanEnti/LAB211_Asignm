/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5;

/**
 *
 * @author HP
 */
public class OnlineCourse extends Course{
    private String platform;
    private String instructor;
    private String note;

    public OnlineCourse() {
        this.platform = "";
        this.instructor = "";
        this.note = "";
    }

    public void inputAll(String platform, String instructor, String note, String name, String id, int credit) {
        super.inputAll(id, name, credit);
        this.platform = platform;
        this.instructor = instructor;
        this.note = note;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
    
    @Override
    public String toString() {
        return "OnlineCourse{" + "platform=" + platform + ", instructor=" + instructor + ", note=" + note + '}';
    }
    
    
    
}
