import LSP.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        /* 
        Rectangle r = new Rectangle(5, 7);
        r.setLength(10);
        r.setWidth(20);
        r.getArea();
        */

        Rectangle r = new Square(5);
        r.setLength(10); // Breaks LSP

        System.out.println(r.getArea()); // print 50 instead of 100


    }

}
