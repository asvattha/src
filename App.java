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

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import Interfaces.House;

public class App {
    public static void main(String[] args) throws Exception {
        
        House h1 = new House("Tyler", 3000, LocalDate.of(1986, 12, 20)); // 0xA
        House h2 = new House("Kyla", 4000, LocalDate.of(1965, 5, 25));
        House h3 = new House("Hector", 2000, LocalDate.of(2020, 8, 12));

        ArrayList<House> houses = new ArrayList<House>(List.of(h1, h2, h3));

        Collections.sort(houses);
        for(House h : houses){
            System.out.println(h);
        }

        House h4 = h1; // h4 is storing 0xA
        System.out.println(h4 == h1);

        House h5 = (House)h1.clone();
        System.out.println(h5 == h1);

        System.out.println(h5.getDateBuilt() == h1.getDateBuilt());


    }

}
