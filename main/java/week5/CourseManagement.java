/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author HP
 */
public class CourseManagement {
    List<OnlineCourse> onList = new ArrayList<>();
    List<OfflineCourse> offList = new ArrayList<>();
    public List<OnlineCourse> getOnlinecourslist(){
        return onList;
    }
    public List<OfflineCourse> getOfflinecourslist(){
        return offList;
    }
    private boolean checkExitOnCourse(OnlineCourse cc){
        for(OnlineCourse c : onList){
            if(c.getCourseID().equals(cc.getCourseID()))
                return false;
        }
        return true;
    }
    private boolean checkExitOffCourse(OfflineCourse cc){
        for(OfflineCourse c : offList){
            if(c.getCourseID().equals(cc.getCourseID()))
                return false;
        }
        return true;
    }
    public boolean addOnlineCourse(OnlineCourse online){
        if(checkExitOnCourse(online)){
            onList.add(online);
            return true;
        }
        return false;
    }
    public boolean addOfflineCourse(OfflineCourse off){
        if(checkExitOffCourse(off)){
            offList.add(off);
            return true;
        }
        return false;
    }
    public boolean deleteOnlineCourse(String idcourse){
        Iterator<OnlineCourse> iterator = onList.iterator();
        while(iterator.hasNext()){
            OnlineCourse oc = iterator.next();
            if(oc.getCourseID().equals(idcourse))
                iterator.remove();
            return true;
        }
        return false;
    }
    public boolean deleteOfflineCourse(String idcourse){
        Iterator<OfflineCourse> iterator = offList.iterator();
        while(iterator.hasNext()){
            OfflineCourse oc = iterator.next();
            if(oc.getCourseID().equals(idcourse))
                iterator.remove();
            return true;
        }
        return false;
    }
    
    public boolean updateOnlineCourse(String idcourse, String newname, int stc){
        for(OnlineCourse c : onList){
            if(c.getCourseID().equals(idcourse)){
                c.setCourseName(newname);
                c.setCredits(stc);
                
                
            }
            return true;
        }
        return false;
    }
    public boolean updateOfflineCourse(String idcourse, String newname, int stc){
        for(OfflineCourse c : offList){
            if(c.getCourseID().equals(idcourse)){
                c.setCourseName(newname);
                c.setCredits(stc);
                
                
            }
            return true;
        }
        return false;
    }
    public List<OnlineCourse>  searchOnlineCoure(String namecourse){
        List<OnlineCourse> result = new ArrayList<>();
        for(OnlineCourse c : onList){
            if(c.getCourseName().contentEquals(namecourse))
                result.add(c);
        }
        return result;
    }
    public List<OfflineCourse>  searchOfflineCoure(String namecourse){
        List<OfflineCourse> result = new ArrayList<>();
        for(OfflineCourse c : offList){
            if(c.getCourseName().contentEquals(namecourse))
                result.add(c);
        }
        return result;
    }
    public void printOnlineCourse(){
        for(OnlineCourse c : onList){
            System.out.println(c.toString());
        }
    }
    public void printOfflineCourse(){
        for(OfflineCourse c : offList){
            System.out.println(c.toString());
        }
    }
    
}
