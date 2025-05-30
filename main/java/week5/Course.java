/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5;

/**
 *
 * @author HP
 */
public class Course {
    private String courseID;
    private String courseName;
    private int credits;

    public Course() {
        this.courseID = "";
        this.courseName = "";
        this.credits = 0;
        
    }
    public void inputAll(String id, String name, int credit){
        this.courseID = id;
        this.courseName = name;
        this.credits = credit;
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }
    
    @Override
    public String toString() {
        return "Course{" + "courseID=" + courseID + ", courseName=" + courseName + ", credits=" + credits + '}';
    }
    
    
}
