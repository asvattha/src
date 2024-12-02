public class Friend {
    private String name;

    public Friend(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void bow(Friend bower){
        System.out.format("%s:  %s has bowed to me!%n", this.name, bower.getName());
        bower.bowback(this);
    }

    public void bowback(Friend bower){
        System.out.format("%s:  %s has bowed back to me!%n", this.name, bower.getName());
    }
}
