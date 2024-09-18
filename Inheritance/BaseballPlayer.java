package Inheritance;

public class BaseballPlayer extends Person{
    
    double battingAvg;
    int homeRuns;

    public BaseballPlayer(String name, int age, double battingAvg, int homeRuns){
        this.name = name;
        this.age = age;
        this.battingAvg = battingAvg;
        this.homeRuns = homeRuns;
        
    }


    public double getBattingAvg() {
        return battingAvg;
    }

    public int getHomeRun(){
        return homeRuns;
    }

}
