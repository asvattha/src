package Decomposition.Composition;
import java.util.ArrayList;

public class House {

    String address;
    String owner;
    ArrayList<Room> rooms;

    public House(String owner, String address){
        this.owner = owner;
        this.address = address;
        rooms = new ArrayList<Room>();
        rooms.add(new Room(10, 10));
        rooms.add(new Room(20, 20));
    }
    
    public String getOwner(){
        return owner;
    }
    
}
