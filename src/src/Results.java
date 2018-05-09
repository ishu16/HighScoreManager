package src;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Results {

    static Competitor []array = new Competitor[2]; //array(object) is created to store each competitor 
    static int maxScore = 0;//store max score
    static int maxCoin = 0;//store max coin
    static int maxDistance =0;//store max distance
    static Menu menu = new Menu();//object from the menu class
  
    public static void initialise(Competitor []array){//initialise the obj array
        for (int i = 0 ; i<array.length;i++){//loops the array length
            array[i] = new Competitor();//create a object (Competitor)
            array[i].setComNumber(0);
            array[i].setComName("null");
            array[i].setComAge(0);
            array[i].setComCoins(0);
            array[i].setComDistance(0);
            array[i].setComScore(0);
            //System.out.println(array[i].getComName() + "" + array[i].getComNumber());
        }


    }

    public static void viewCompetitors (Competitor []array){
    if (!(array[0].getComNumber() == 0)) {
        for (int i = 0; i < array.length; i++) {
            if (!(array[i].getComNumber() == 0)) {
                System.out.println(array[i].getComNumber() + " " + array[i].getComName() + " " + array[i].getComAge() + " " + array[i].getComCoins() + " " + array[i].getComScore() + " " + array[i].getComDistance());
            }
        }
    }else {
        System.out.println("");
        System.out.println(" No Competitor Details Available ! ");
        System.out.println("");
        menu.menu(array);

    }
    }


    public static void addCompetitors (Competitor []array, Scanner input){//scanner input is passed as a parameter
        try {//try is used if a false input is provided (Invalid Input)
            for (int i = 0; i < array.length; i++) {
                System.out.print("Competitor No : ");
                int comNo = input.nextInt();
                array[i].setComNumber(comNo);

                System.out.print("Name : ");
                String name = input.next();
                array[i].setComName(name);

                System.out.print("Age : ");
                int age = input.nextInt();
                array[i].setComAge(age);

                System.out.print("Coins Collected : ");
                int coins = input.nextInt();
                array[i].setComCoins(coins);

                System.out.print("Score Achieved : ");
                int score = input.nextInt();
                array[i].setComScore(score);

                System.out.print("Distance Reached : ");
                int distance = input.nextInt();
                array[i].setComDistance(distance);

            }
        }catch (InputMismatchException e){
            System.out.println(" ");
            System.out.println(" Invalid Input ! ");
            menu.menu(array);//display the menu
            initialise(array);//initialise the array again
        }
   }


    public static void searchCompetitor (Competitor []array,int comNumber){
        for (int i = 0 ; i < array.length; i ++){
            if (array[i].getComNumber() == comNumber) {
                System.out.println("Name : " +array[i].getComName()+ " Coins Collected : " +array[i].getComCoins() +" Score Achieved : " +array[i].getComScore() +" Distance : " +array[i].getComDistance()  );

            }else{
                System.out.println(" ");
                System.out.println(" Invalid Competitor Number ! ");
                menu.menu(array);
                break;
            }
        }
    }


    public static void threeWinners (Competitor[] array){


            maxScore = array[0].getComScore();//initially gets the score from the array index 0
            maxCoin = array[0].getComCoins();//initially gets the coin from the array index 0
            maxDistance = array[0].getComDistance();//initially gets the distance from the array index 0

            //Gets the highest score.
            for (int i = 0; i < array.length; i++) {
                if (array[i].getComScore() >= maxScore) {
                    maxScore = array[i].getComScore();

                }

            }
            for (int i = 0; i < array.length; i++) {
                if (array[i].getComScore() == maxScore) {
                    System.out.println(array[i].getComName() + " has achieved the Highest Score, which is " + array[i].getComScore());
                }


                //Gets the highest distance
            }
            for (int i = 0; i < array.length; i++) {
                if (array[i].getComDistance() >= maxDistance) {
                    maxDistance = array[i].getComDistance();

                }

            }
            for (int i = 0; i < array.length; i++) {
                if (array[i].getComDistance() == maxDistance) {
                    System.out.println(array[i].getComName() + " has achieved the Highest Distance, which is " + array[i].getComDistance());
                }


                //Gets the highest collected coins
            }
            for (int i = 0; i < array.length; i++) {
                if (array[i].getComCoins() >= maxCoin) {
                    maxCoin = array[i].getComCoins();

                }

            }
            for (int i = 0; i < array.length; i++) {
                if (array[i].getComCoins() == maxCoin) {
                    System.out.println(array[i].getComName() + " has collected the Highest Number of Coins, which is " + array[i].getComCoins());
                }

            }

    }


    public static void selectedWinner (Competitor []array, int num){
    	try{
        if (num == 1){
            for (int i =0 ; i<array.length;i++){
                if (array[i].getComScore() == maxScore){
                    System.out.println(" Competitor Number : " +array[i].getComNumber());
                    System.out.println(" Competitor Name : " +array[i].getComName());
                    System.out.println(" Competitor Age : " +array[i].getComAge());
                    System.out.println(" Coins Collected : " +array[i].getComCoins());
                    System.out.println(" Score Achieved : " +array[i].getComScore());
                    System.out.println(" Distance Reached : " +array[i].getComDistance());
                }
            }
        }
        else if (num == 2){
            for (int i = 0 ; i <array.length;i++){
                if(array[i].getComDistance() == maxDistance){
                    System.out.println(" Competitor Number : " +array[i].getComNumber());
                    System.out.println(" Competitor Name : " +array[i].getComName());
                    System.out.println(" Competitor Age : " +array[i].getComAge());
                    System.out.println(" Coins Collected : " +array[i].getComCoins());
                    System.out.println(" Score Achieved : " +array[i].getComScore());
                    System.out.println(" Distance Reached : " +array[i].getComDistance());
                }

            }
        }else if (num == 3){
            for (int i = 0 ; i < array.length; i++){
                if(array[i].getComCoins() == maxCoin){
                    System.out.println(" Competitor Number : " +array[i].getComNumber());
                    System.out.println(" Competitor Name : " +array[i].getComName());
                    System.out.println(" Competitor Age : " +array[i].getComAge());
                    System.out.println(" Coins Collected : " +array[i].getComCoins());
                    System.out.println(" Score Achieved : " +array[i].getComScore());
                    System.out.println(" Distance Reached : " +array[i].getComDistance());
                }

            }
        }
    	}catch(InputMismatchException e){
    		System.out.println(" ");
    		System.out.println(" Invalid Input ! ");
    		me
    	}

    }



public static void main(String[] args) {
    initialise(array);
    menu.menu(array);
}


}
