public class GuardedBlocks {
    
    boolean joy = false;

    public synchronized void guardedJoy() {
        while(!joy) {
            try {
                System.out.println("Inside the loop");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Joy has been achieved");
    }

    public synchronized void setJoy() {
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        joy = true;
        notifyAll();
    }
}