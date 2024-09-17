package Decomposition.Aggregation;

public class Aircraft {

    String id;
    CrewMember cw;

    public Aircraft(String id, CrewMember cw) {
        this.id = id;
        this.cw = cw;
    }

    public String getId(){
        return id;
    }
    
}
