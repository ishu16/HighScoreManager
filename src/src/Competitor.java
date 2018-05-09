package src;


public class Competitor {

    private int comNumber;
    private String comName;
    private int comAge;
    private int comCoins;
    private int comScore;
    private int comDistance;
    //Common variables for all competitors 


    public int getComNumber() {
        return comNumber;
    }//gets the competitor number and returns it

    public void setComNumber(int comNumber) {//input is passed a parameter
        this.comNumber = comNumber;//sets the input competitor number
    }

    public String getComName() {
        return comName;
    }//gets the competitor name and returns it

    public void setComName(String comName) {//input is passed a parameter
        this.comName = comName;//sets the input competitor name
    }

    public int getComAge() {
        return comAge;
    }//gets the competitor age and returns it

    public void setComAge(int comAge) {//input is passed as a parameter
        this.comAge = comAge;//sets the input competitor name
    }

    public int getComCoins() {
        return comCoins;
    }//gets the collected coins

    public void setComCoins(int comCoins) {//input is passed as a parameter
        this.comCoins = comCoins;//sets the input collected coins
    }

    public int getComScore() {
        return comScore;
    }//gets the collect score

    public void setComScore(int comScore) {//input is passed as a parameter
        this.comScore = comScore;//sets the input score
    }

    public int getComDistance() {
        return comDistance;
    }//gets the distance

    public void setComDistance(int comDistance) {//input is passed as a parameter
        this.comDistance = comDistance;//sets the input distance
    }
}
