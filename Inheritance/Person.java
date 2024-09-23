package Inheritance;

public class Person {
    
    String name;
    int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;    
    }

    public Person() {
        this.name = "";
        this.age = 0;
    }

    public void foo() {
        System.out.println("Do Something");
    }

    

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }


}
