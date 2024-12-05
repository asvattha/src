import java.util.Random;

public class Producer {
    
    String[] msgs;

    public Producer(){
        msgs = new String[]{"marianne", "when the saints go marching", "hand over hand", "Done"};
    }

    public void produce(Drop drop) {
        Random random = new Random();
        for(int i = 0; i < msgs.length; i++) {
            drop.put(msgs[i]);
        
            try {
                Thread.sleep(random.nextInt(5000));
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
