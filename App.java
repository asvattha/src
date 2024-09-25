import Encapsulation.Registrar;
import Decomposition.Aggregation.Aircraft;
import Decomposition.Aggregation.CrewMember;
import Decomposition.Aggregation.CustomerService;
import Decomposition.Composition.*;
//import Immutability.Student;
import Inheritance.BaseballPlayer;
import Inheritance.*;
import this_reference.Student;
import Polymorphism.*;

import java.util.Date;

public class App {
    public static void main(String[] args) throws Exception {
        
        /* 
        Student s1 = new Student("Tyler", 22, new Date(20000));

        Date s1_dob = s1.getDob();
        s1_dob.setTime(40000);
        */

/* 
        Person p1 = new Person("Tyler", 22);

        BaseballPlayer p2 = new BaseballPlayer("Tyler", 22, 0.202, 35);
        p2.getName();
        p2.foo();


        BaseballPlayer p3 = new BaseballPlayer("Timothy", 26, 0.232, 40);
        p3.getName();
        p3.foo();
        */

        /* 
        Student s1 = new Student("Tyler", 22, 3.5);
        Student s2 = new Student("Kyla", 24, 3.8);

        s1.compareTo(s2);
        s1.foo();
        s2.foo();
        */

        Base obj1 = new Derived(10); // Widening
        System.out.println(obj1.getValue()); 

    }
}
