public class Drop {
    private String msg;

    private boolean empty = true;

    public synchronized void put(String msg) {
        if(!empty)
            try {
                wait();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        this.msg = msg;
        empty = false;
        notifyAll();
    }

    public synchronized String take(){
        if (empty) {
            try {
                wait();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        empty = true;
        notifyAll();
        return msg;
    }

}
