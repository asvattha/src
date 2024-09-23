package Inheritance;

public class BaseballPlayer extends Person{
    
    double battingAvg;
    int homeRuns;

    public BaseballPlayer(String name, int age, double battingAvg, int homeRuns){
        super(name, age); // parameterized constructor of the base class
        this.battingAvg = battingAvg;
        this.homeRuns = homeRuns;
        
    }

    // Method Overriding
    public void foo() {
        System.out.println("Do Something Else");
    }

    public double getBattingAvg() {
        return battingAvg;
    }

    public int getHomeRun(){
        return homeRuns;
    }

}
