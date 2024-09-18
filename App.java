import Encapsulation.Registrar;
import Decomposition.Aggregation.Aircraft;
import Decomposition.Aggregation.CrewMember;
import Decomposition.Aggregation.CustomerService;
import Decomposition.Composition.*;
import Immutability.Student;
import Inheritance.BaseballPlayer;
import Inheritance.*;

import java.util.Date;

public class App {
    public static void main(String[] args) throws Exception {
        
        /* 
        Student s1 = new Student("Tyler", 22, new Date(20000));

        Date s1_dob = s1.getDob();
        s1_dob.setTime(40000);
        */


        Person p1 = new Person("Tyler", 22);

        BaseballPlayer p2 = new BaseballPlayer("Tyler", 22, 0.202, 35);
        
        

        
    }
}
