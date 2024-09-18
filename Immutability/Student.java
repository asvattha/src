package Immutability;
import java.util.Date;

public final class Student {

    private final String name;
    private final int age;
    //private final Date dob;

    public Student(String name, int age){
        this.name = name;
        this.age = age;
        
    }



    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }


    
}
