import Encapsulation.Registrar;
import Decomposition.Aggregation.Aircraft;
import Decomposition.Aggregation.CrewMember;
import Decomposition.Aggregation.CustomerService;
import Decomposition.Composition.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        // THis is wrong because of composition relationship
        Room r1 = new Room(30, 30);
        r1.getWidth();


        CrewMember c1 = new CrewMember("Sierra");
        CustomerService cs = new CustomerService(c1);

        {
            Aircraft a1 = new Aircraft("EM24K",+);
            a1.getId();
            c1.getName();
        }

        a1.getId(); // Why this is an error? 
        c1.getName(); 


        
    }
}
