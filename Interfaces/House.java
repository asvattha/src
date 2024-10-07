package Interfaces;

public class House {

    String owner;
    double area;
    LocalDate dateBuilt;

    public House(String owner, double area, LocalDate dataBuilt){
        this.owner = owner;
        this.area = area;
        this.dateBuilt = dateBuilt;
    }

    public LocalDate getDateBuilt(){
        return dateBuilt;
    }
    
}
