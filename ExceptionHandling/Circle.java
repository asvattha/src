package ExceptionHandling;

public class Circle {
    int radius;

    public Circle(int radius) throws NegativeRadiusException{
        if (radius < 0){
            throw new NegativeRadiusException(radius);
        }
        this.radius = radius;
    }
    
    public void setRadius(int radius) throws NegativeRadiusException {
        if (radius < 0){
            throw new NegativeRadiusException(radius);
        }
        this.radius = radius;
    }
}
