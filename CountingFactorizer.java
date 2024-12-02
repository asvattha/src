import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

class CountingFactorizer {

    int lastNumber = 0;
    ArrayList<Integer> lastFactors = new ArrayList<>();
    boolean flag = false;

    public void findFactors(int n) {
        ArrayList<Integer> factors = new ArrayList<>();
        synchronized(this) {
            if (n == lastNumber) {
                factors = (ArrayList<Integer>)lastFactors.clone();
                System.out.println(Thread.currentThread().getName() + ": Getting from old computation");
            }
        }
        if(factors.size() == 0){
            factors = factor(n);
            synchronized(this)
            {
                lastNumber = n;
                lastFactors = factors;
                System.out.println(Thread.currentThread().getName() + ": Getting a new computation");
            }
        }
    }

    public void printLastFactors() {
        synchronized(this) {
            for(int item : lastFactors)
                System.out.print(Thread.currentThread().getName() + ":" + item + " ");
            System.out.println();
        }
    }

    public ArrayList<Integer> factor(int n) {
        ArrayList<Integer> lastFactors = new ArrayList<>();
        while (n % 2 == 0) {
            lastFactors.add(2);
            n /= 2;
        }
 
        // n must be odd at this point.  So we can
        // skip one element (Note i = i +2)
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            // While i divides n, print i and divide n
            while (n % i == 0) {
                lastFactors.add(i);
                n /= i;
            }
        }
 
        // This condition is to handle the case when
        // n is a prime number greater than 2
        if (n > 2)
            lastFactors.add(n);

        return lastFactors;
    }
}