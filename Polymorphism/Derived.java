package Polymorphism;

public class Derived extends Base{
    
    public Derived(int value){
        super(value);
    }

    public int getValueDoubled() {
        return getValue() * 2;
    }
}
