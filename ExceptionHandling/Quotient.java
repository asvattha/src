package ExceptionHandling;

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
    
}
