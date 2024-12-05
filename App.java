public class App {
    public static void main(String[] args) throws Exception {

        PrintMsg obj = new PrintMsg();
        //LazyInitializer lobj = new LazyInitializer();
        //CountingFactorizer cf = new CountingFactorizer();

        Friend alphanso = new Friend("Alphonso");
        Friend garry = new Friend("Garry");

        //GuardedBlocks gb = new GuardedBlocks();

        Drop drop = new Drop();

        IntrinsicLock il = new IntrinsicLock();

        Thread t1 = new Thread(new Runnable(){
            public void run() {
                //obj.increment();
                //lobj.getInstance();
                //cf.findFactors(10);
                //cf.printLastFactors();
                alphanso.bow(garry);
                //gb.setJoy();

                //Producer producer = new Producer();
                //producer.produce(drop);

                //il.increment();

            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                obj.decrement();
                //lobj.getInstance();
                //cf.findFactors(20);
                //cf.printLastFactors();
                garry.bow(alphanso);
                //gb.guardedJoy();

                //Consumer consumer = new Consumer();
                //consumer.consume(drop);

                il.decrement();
            }
        });

        t1.setName("Thread A");
        t2.setName("Thread B");

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        //System.out.println("The value of count is: " + obj.getValue());
    }
}
