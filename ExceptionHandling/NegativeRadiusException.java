package ExceptionHandling;

public class NegativeRadiusException extends Exception{

    public NegativeRadiusException(int radius){
        super(radius +  " can't be negative. please fix it!");
    }
    
}
