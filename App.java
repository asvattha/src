import ExceptionHandling.*;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.FileNotFoundException;

public class App {
    public static void main(String[] args) throws Exception {

        boolean flag = true;
        
        do{
            try{
                Scanner input = new Scanner(System.in);
                System.out.println("Enter two integers: ");
                int x = input.nextInt();
                int y = input.nextInt();
                flag = false;

                System.out.println(x / y);
            } catch(InputMismatchException ex){
                flag = true;
            } catch(ArithmeticException ex) {
                System.out.println("Please make sure the denominator is not zero");
                flag = true;
            } 
            /*catch(FileNotFoundException ex) {
                System.out.println("Make sure you entered correct file path");
            }
                */
            System.out.println("Hello World");


            try{
                Circle c1 = new Circle(5);
                Circle c2 = new Circle(-5);
            } catch(NegativeRadiusException ex) {
                System.out.println("Can't have negative radius");
            }
            finally{
                System.out.println("This code executes everytime");
            }
        }while(flag);

    }

}
