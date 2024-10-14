package LSP;
public class Rectangle {
    
    float l, w;

    public Rectangle(float l, float w){
        this.l = l;
        this.w = w;
    }

    public float getArea(){
        return l * w;
    }

    public void setLength(float length) {
        l = length;
    }

    public void setWidth(float width){
        w = width;
    }
}
