package Encapsulation;

public class Student {
    
    public String name;
    private double attendanceScore;
    private double gpa;

    public Student(String name, double gpa){
        this.name = name;
        this.gpa = gpa;
    }

    public double getGpa(){
        return gpa;
    }

    public double getAttendanceScore(){
        return attendanceScore;
    }

    public boolean atRisk(){
        if (gpa < 2.5 && attendanceScore < 0.6) {
            return true;
        }
        else{
            return false;
        }
    }
}
