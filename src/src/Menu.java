package src;

import java.util.Scanner;

public class Menu {

    public void menu(Competitor []array) { //array is passed as a parameter
        Scanner sc = new Scanner(System.in);//scanner input

        System.out.println("--- WELCOME TO TEMPLE RUN HIGH SCORE MANAGER---");
        System.out.println("  1. Enter Competitor Details ");
        System.out.println("  2. View All Competitor Details ");
        System.out.println("  3. Search Competitor Details ");
        System.out.println("  4. Top 3 Competitors ");
        System.out.println("  5. View a Selected Winner ");
        System.out.print(" Please enter a number to proceed >>>> ");
        
        String input = sc.next();//gets the input from the user

            switch (input) {
                case "1":
                    Results.addCompetitors(array, sc);//add competitor method is called
                    menu(array);//after completion display the menu again
                    break;
                case "2":
                    Results.viewCompetitors(array);//view competitor method is called
                    menu(array);//after completion display the menu again
                    break;
                case "3":
                    System.out.print(" Enter Competitor Number : ");
                    int num = sc.nextInt();
                    Results.searchCompetitor(array, num);//search competitor method is called
                    menu(array);//after completion display the menu again
                    break;
                case "4":
                    Results.threeWinners(array);//threewinners method is called
                    menu(array);//after completion display the menu again
                    break;
                case "5":
                    System.out.print("Press [ 1 ] - Highest Score | "
                    		+ "Press [ 2 ] - Maximum Distance | Press [ 3 ] - Maximum Coins ");
                    int num2 = sc.nextInt();
                    Results.selectedWinner(array, num2);//select winner method is called
                    menu(array);//after completion display the menu again
                    break;
                default://executes if an invalid input is provided
                    System.out.println(" ");
                    System.out.println(" Invalid Input !");//displays
                    menu(array);//returns to the menu

        }

    }
}
