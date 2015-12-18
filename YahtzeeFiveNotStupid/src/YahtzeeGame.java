import java.util.Scanner;

/**
 * Created by nfrederick18 on 12/17/15.
 */
public class YahtzeeGame {

    /* instance data should include the five yahtzee dice, a scoreboard, and a CONSTANT (static final) variable NUM_SIDES
	which should be set to six (the number of sides on a yahtzee die) */
    private YahtzeeDie yahtzeeDie1;
    private YahtzeeDie yahtzeeDie2;
    private YahtzeeDie yahtzeeDie3;
    private YahtzeeDie yahtzeeDie4;
    private YahtzeeDie yahtzeeDie5;
    private YahtzeeScoreCard scoreBoard;
    private static int numSides = 6;
    private Scanner s;



    /* initializes the dice and scoreboard */
    public YahtzeeGame()
    {
        yahtzeeDie1 = new YahtzeeDie(6);
        yahtzeeDie2 = new YahtzeeDie(6);
        yahtzeeDie3 = new YahtzeeDie(6);
        yahtzeeDie4 = new YahtzeeDie(6);
        yahtzeeDie5 = new YahtzeeDie(6);
        scoreBoard = new YahtzeeScoreCard();
        s = new Scanner(System.in);

    }

    /* check to see if the game is over, and while the game is not over call the method takeTurn()
    once the game ends (hint: there are 13 turns in a game of Yahtzee), the method should print a
    final scorecard and return the grand total */
    public int playGame()
    {
        for(int x = 0;x<13;x++){
            takeTurn();
        }
        return scoreBoard.getGrandTotal();
    }

    /* 	1. call rollDice()
        2. call printDice()
        3. Ask the user if they are satisfied with their roll, or if they would like to roll again.
           If they are not satisfied continue, otherwise call markScore()
        4. call chooseFrozen()
        5. call rollDice()
        6. call printDice()
        7. Ask the user if they are satisfied with their roll, or if they would like to roll again.
           If they are not satisfied continue, otherwise call markScore()
        8. call chooseFrozen()
        9. call rollDice()
        10. call printDice()
        11. call markScore()
    */
    private void takeTurn()
    {
        rollDice();
        printDice();
        System.out.print("Are you (s)atisfied or to you want to freeze dice and (r)oll again? (s/r): ");
        if(!s.nextLine().equals("r")){
            markScore();
        }else {
            chooseFrozen();
            rollDice();
            printDice();
            System.out.print("Are you (s)atisfied or to you want to freeze dice and (r)oll again? (s/r):");
            if(!s.nextLine().equals("r")){
                markScore();
            }else{
                chooseFrozen();
                rollDice();
                printDice();
                markScore();
            }
        }
    }

    /* Rolls all unfrozen dice.  Also resets all dice to the unfrozen state after the roll */
    private void rollDice()
    {
        if(!yahtzeeDie1.isFrozen()){
            yahtzeeDie1.rollDie();
        }
        if(!yahtzeeDie2.isFrozen()){
            yahtzeeDie2.rollDie();
        }
        if(!yahtzeeDie3.isFrozen()){
            yahtzeeDie3.rollDie();
        }
        if(!yahtzeeDie4.isFrozen()){
            yahtzeeDie4.rollDie();
        }
        if(!yahtzeeDie5.isFrozen()){
            yahtzeeDie5.rollDie();
        }

        if(yahtzeeDie1.isFrozen()){
            yahtzeeDie1.unfreezeDie();
        }
        if(yahtzeeDie2.isFrozen()){
            yahtzeeDie1.unfreezeDie();
        }
        if(yahtzeeDie3.isFrozen()){
            yahtzeeDie1.unfreezeDie();
        }
        if(yahtzeeDie4.isFrozen()){
            yahtzeeDie1.unfreezeDie();
        }
        if(yahtzeeDie5.isFrozen()){
            yahtzeeDie1.unfreezeDie();
        }
    }

    /* Asks the user which dice should be frozen 1-5 (should be read in in one line) */
    private void chooseFrozen()
    {
        System.out.println("Please choose the die you would like to freeze (1-5): ");
        String k = s.nextLine();
        if(k.indexOf("1")!=-1){
            yahtzeeDie1.freezeDie();
        }
        if(k.indexOf("2")!=-1) {
            yahtzeeDie2.freezeDie();
        }
        if(k.indexOf("3")!=-1) {
            yahtzeeDie3.freezeDie();
        }
        if(k.indexOf("4")!=-1) {
            yahtzeeDie4.freezeDie();
        }
        if(k.indexOf("5")!=-1) {
            yahtzeeDie5.freezeDie();
        }
    }

    /* Should print the value of all five dice separated by a tab (\t) to the console */
    private void printDice()
    {
        System.out.println("Your Roll is: \n"+ yahtzeeDie1.getValue()+"\t"+yahtzeeDie2.getValue()
                +"\t"+yahtzeeDie3.getValue()+"\t"+yahtzeeDie4.getValue()+"\t"+yahtzeeDie5.getValue());
    }

    /* 1. Print a scoreboard
       2. Ask the user where they would like to mark their score.
       3. Call appropriate function
       4. If false is returned the user entered an invalid number, so ask the user to try again	*/
    private void markScore()
    {
        scoreBoard.printScoreCard();
        System.out.print("Where would you like to place your score? \n 1. Ones \t7.  3 of Kind \n 2. Twos \t8.  4 of Kind \n 3. Threes \t9.  Full House" +
                "\n 4. Fours \t10. Sm Straight \n 5. Fives \t11. Lg Straight \n 6. Sixes \t12. Yahtzee \n \t\t13. Chance \n Enter 1-13: ");
        int k = s.nextInt();
        boolean markSuccessful = false;
        int d1 = yahtzeeDie1.getValue();
        int d2 = yahtzeeDie2.getValue();
        int d3 = yahtzeeDie3.getValue();
        int d4 = yahtzeeDie4.getValue();
        int d5 = yahtzeeDie5.getValue();
        while(!(k>=1 && k<=13 && markSuccessful)){
            if(k==1){
                markSuccessful = scoreBoard.markOnes(d1, d2, d3, d4, d5);
            }else if(k==2){
                markSuccessful = scoreBoard.markTwos(d1, d2, d3, d4, d5);
            }else if(k==3){
                markSuccessful = scoreBoard.markThrees(d1, d2, d3, d4, d5);
            }else if(k==4){
                markSuccessful = scoreBoard.markFours(d1, d2, d3, d4, d5);
            }else if(k==5){
                markSuccessful = scoreBoard.markFives(d1, d2, d3, d4, d5);
            }else if(k==6){
                markSuccessful = scoreBoard.markSixes(d1, d2, d3, d4, d5);
            }else if(k==7){
                markSuccessful = scoreBoard.markThreeOfAKind(d1, d2, d3, d4, d5);
            }else if(k==8){
                markSuccessful = scoreBoard.markFourOfAKind(d1, d2, d3, d4, d5);
            }else if(k==9){
                markSuccessful = scoreBoard.markFullHouse(d1, d2, d3, d4, d5);
            }else if(k==10){
                markSuccessful = scoreBoard.markSmallStraight(d1, d2, d3, d4, d5);
            }else if(k==11){
                markSuccessful = scoreBoard.markLargeStraight(d1, d2, d3, d4, d5);
            }else if(k==12) {
                markSuccessful = scoreBoard.markYahtzee(d1, d2, d3, d4, d5);
            }else if(k==13) {
                markSuccessful = scoreBoard.markChance(d1, d2, d3, d4, d5);
            }else{
                markSuccessful= false;
                System.out.println("Where would you like to place your score? \n ");
                k = s.nextInt();
            }
            if(!markSuccessful){
                System.out.println("Where would you like to place your score? \n ");
                k = s.nextInt();
            }
        }
        s.nextLine();
    }
}
