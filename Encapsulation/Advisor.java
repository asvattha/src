package Encapsulation;

import java.util.ArrayList;

public class Advisor {
    
    String name;

    public Advisor(String name){
        this.name = name;
    }

    public void bar(ArrayList<Student> students){
        /* 
        double gpa = students.get(0).getGpa();
        double attendanceScore = students.get(0).getAttendanceScore();
        if(gpa < 2.5 && attendanceScore < 0.6) {
            System.out.println("At risk");
        }
        else{
            System.out.println("Not at risk");
        }
            */
        boolean atRisk = students.get(0).atRisk();
        if(atRisk){
            System.out.println("At risk");
        }
        else{
            System.out.println("Not at risk");
        }
    }
}
