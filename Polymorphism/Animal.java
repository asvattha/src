package Polymorphism;

public class Animal {
    String name;

    public Animal(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String speak() {
        return "???";
    }
    
}
