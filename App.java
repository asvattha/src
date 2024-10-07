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
        
        Animal[] animals = new Animal[6];
        animals[0] = new Dog("Cassy");
        animals[1] = new Dog("Buster");
        animals[2] = new Dog("Heidi");
        animals[3] = new Cat("Mary");
        animals[4] = new Cat("Lucy");
        animals[5] = new Cat("Cupcake");


        for(Animal a: animals){
            report(a);
        }
        /* 
        Dog[] dogs = new Dog[3];
        dogs[0] = new Dog("Cassy");
        dogs[1] = new Dog("Buster");
        dogs[2] = new Dog("Heidi");

        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Mary");
        cats[1] = new Cat("Lucy");
        cats[2] = new Cat("Cupcake");

        for(Dog d: dogs) {
            //reportDog(d);
            report(d);
        }

        for(Cat c: cats) {
            report(c);
        }
            */

    }

    public static void report(Animal a){
        System.out.println(a.getName() + " speaks " + a.speak());
    }
    /* 
    public static void reportDog(Dog d){
        System.out.println(d.getName() +  " speaks " + d.speak());
    }

    public static void reportCat(Cat c){
        System.out.println(c.getName() +  " speaks " + c.speak());
    }
        */
}
