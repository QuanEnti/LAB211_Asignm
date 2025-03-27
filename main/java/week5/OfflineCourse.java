/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5;

/**
 *
 * @author HP
 */
public class OfflineCourse extends Course{
    private String begin;
    private String end;
    private String campus;

    public OfflineCourse() {
        this.begin = "";
        this.end = "";
        this.campus = "";
    }

    public String getBegin() {
        return begin;
    }

    public void setBegin(String begin) {
        this.begin = begin;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    public void inputAll(String begin, String end, String campus, String id, String name, int credit) {
        super.inputAll(id, name, credit);
        this.begin = begin;
        this.end = end;
        this.campus = campus;
    }

    @Override
    public String toString() {
        return "OfflineCourse{" + "begin=" + begin + ", end=" + end + ", campus=" + campus + '}';
    }
    
    
    
}
