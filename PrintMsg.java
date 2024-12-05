import java.util.concurrent.atomic.AtomicInteger;

public class PrintMsg {
    int count = 0;

    void increment() {
        double x = 6.5;
        for(int i = 0; i < 50000; i++)
        synchronized(this){ // Intrinsic Locks
            count++;
        }
    }

    void decrement() {
        double x = 60.9;
        for(int i = 0; i < 50000; i++)
        synchronized(this) { count--; }
    }

    public int getValue() {
        return count;
    }

    
}
