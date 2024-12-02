import java.util.concurrent.atomic.AtomicInteger;

public class PrintMsg {
    AtomicInteger count = new AtomicInteger(0);

    void increment() {
        for(int i = 0; i < 50000; i++)
            count.getAndIncrement();
    }

    void decrement() {
        for(int i = 0; i < 50000; i++)
            count.getAndDecrement();
    }

    public int getValue() {
        return count.get();
    }

}
