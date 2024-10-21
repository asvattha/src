package ExceptionHandling;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Quotient {

    int num, den;

    public Quotient(int num, int den){
        this.num = num;
        this.den = den;
    }

    public double findQuotient(int num, int den){
        if(den == 0) {
            throw new ArithmeticException(); // throwing exception
        }
        return num / den;
    }

    public void foo(String filePath) throws FileNotFoundException {

        
        
        File file = new File(filePath);
        Scanner input = new Scanner(file);

         
        if (!file.exists()) {
            throw new FileNotFoundException();
        }

        while(input.hasNext()){
            String firstName = input.next();
            String lastName = input.next();
            int id = input.nextInt();

            System.out.println(firstName + ", " + lastName +", " + id);
        }

        input.close();
    
    }
    
}
