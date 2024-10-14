package LSP;
public class Square extends Rectangle{

    public Square(float s){
        super(s,s);
    }

    public float getArea(){
        return super.getArea();
    }

    public void setSide(float side){
        setLength(side);
        setWidth(side);
    }
}
