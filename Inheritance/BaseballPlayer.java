package Inheritance;

public class BaseballPlayer extends Person{
    
    double battingAvg;
    int homeRuns;

    public BaseballPlayer(String name, int age, double battingAvg, int homeRuns){
        super(name, age); // parameterized constructor of the base class
        this.battingAvg = battingAvg;
        this.homeRuns = homeRuns;
        
    }

    @Override
    public int isOdd(int x){
        return 1;
    }


    @Override
    // Method Overriding
    public void foo() {
        name = "Robin";
        //super.foo();
        System.out.println("Do Something Else");
    }

    public void add() {
        isOdd();
    }

    public double getBattingAvg() {
        return battingAvg;
    }

    public int getHomeRun(){
        return homeRuns;
    }

    public void bar() {
        super.foo();
        System.out.println("Do Something else");
    }

}
