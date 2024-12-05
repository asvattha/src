import java.util.Random;

public class Consumer {
    
    public void consume(Drop drop) {
        Random random = new Random();
        
        while(true) {
            try {
                Thread.sleep(random.nextInt(5000));
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            String msg = drop.take();
            System.out.println(msg);
            if (msg.equals("Done")) {
                break;
            }
        }
    }
}
