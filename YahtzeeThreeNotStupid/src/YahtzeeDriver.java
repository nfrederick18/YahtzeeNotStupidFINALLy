import java.util.Random;
import java.util.Scanner;

/**
 * Created by nfrederick18 on 12/17/15.
 */
public class YahtzeeDriver {

    /*
       1. Creates a new instance of the YahtzeeGame class
       2. Calls the playGame method on the Yahtzee object
       3. Asks user if they would like to play again
       4. When the user is done playing, prints the number of games played, min, max, and average score
       */
    public static void main(String [] args)
    {
        int score;
        Random r = new Random();
        YahtzeeGame myGame=new YahtzeeGame();
        System.out.println("Welcome to Nicole's APCSA Yahtzee Game!");
        Scanner s = new Scanner(System.in);
        String playNewGame=new String("");
        int min = 650;
        int max = 0;
        int games = 0;
        double overallScore = 0;
        while(!playNewGame.equals("n")){
            score=myGame.playGame();
            System.out.print("Do you want to play another Game:(y/n)");
            games++;
            if(score<min){
                min = score;
            }if(score>max){
                max = score;
            }
            overallScore = overallScore+score;
            playNewGame = s.nextLine();
        }
        System.out.println("games plays:"+ games + " Max: "+max + " Min: "+ min + " Average Score:"+ (overallScore/games));


    }
}


