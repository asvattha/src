public class Friend {
    private final String name;

    public Friend(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public synchronized void bow(Friend bower){
        System.out.format("%s:  %s has bowed to me!%n", this.name, bower.getName());
        bower.bowback(this);
    }

    public synchronized void bowback(Friend bower){
        System.out.format("%s:  %s has bowed back to me!%n", this.name, bower.getName());
    }
}
