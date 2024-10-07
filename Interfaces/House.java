package Interfaces;
import java.time.LocalDate;

public class House implements Comparable<House>, Cloneable {

    String owner;
    double area;
    LocalDate dateBuilt;

    public House(String owner, double area, LocalDate dateBuilt){
        this.owner = owner;
        this.area = area;
        this.dateBuilt = dateBuilt;
    }

    public LocalDate getDateBuilt(){
        return dateBuilt;
    }

    @Override
    public int compareTo(House h){
        if(this.dateBuilt.isAfter(h.dateBuilt)){
            return 1;
        }
        else if (this.dateBuilt.isBefore(h.dateBuilt)){
            return -1;
        }
        else 
            return 0;
    }

    @Override
    public String toString(){
        return owner + ": " + dateBuilt.toString();
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        House h = (House)super.clone(); // Shallow copy
        h.dateBuilt = LocalDate.of(this.dateBuilt.getYear(), this.dateBuilt.getMonth(), this.dateBuilt.getDayOfMonth());
        return h;
    }
    
}
