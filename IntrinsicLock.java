public class IntrinsicLock {
    int count = 0;

    public void increment(){
        for(int i = 0; i < 500000; i++){
            synchronized(this) {
                count++;
            }
                
        }
    }

    public void decrement(){
        for(int i = 0; i < 500000; i++){
            synchronized(this){
                count--;
            }
            
        }
    }

    public int getValue() {
        return count;
    }
}
