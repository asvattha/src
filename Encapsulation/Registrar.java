package Encapsulation;

import java.util.ArrayList;

public class Registrar {
    
    ArrayList<Student> students;

    public Registrar(){
        students = new ArrayList<Student>();
    }

    public void registerStudents(){
        Student s1 = new Student("Kyla", 2.3);
        Student s2 = new Student("Tyler", 3.3);

        students.add(s1);
        students.add(s2);
    }

    public ArrayList<Student> getStudents(){
        return students;
    }
}
