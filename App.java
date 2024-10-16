import ExceptionHandling.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        Quotient q = new Quotient(4, 5);
        System.out.println("Opened files and write stuff to them");

        try{
            System.out.println(q.findQuotient(5, 0));
            System.out.println("Hello World");
        }
        catch(ArithmeticException ex){ // catching exception
            System.out.println("Can't divide by zero");
        }
        
        System.out.println("Close all files");


    }

}
