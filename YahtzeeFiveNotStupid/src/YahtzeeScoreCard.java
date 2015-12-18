/**
 * Created by nfrederick18 on 12/17/15.
 */
public class YahtzeeScoreCard {

    /* instance data given */
    private int ones;
    private int twos;
    private int threes;
    private int fours;
    private int fives;
    private int sixes;
    private int threeKind;
    private int fourKind;
    private int fiveKind;
    private int chance;
    private int fullHouse;
    private int smStraight;
    private int lgStraight;
    private boolean bonus;

    /* Sets up a new game.  Sets all instance data to incomplete (-1). Sets bonus to false */
    public YahtzeeScoreCard() {
        bonus = false;
        ones = -1;
        twos = -1;
        threes = -1;
        fours = -1;
        fives = -1;
        sixes = -1;
        threeKind = -1;
        fourKind = -1;
        fiveKind = -1;
        chance = -1;
        fullHouse = -1;
        smStraight = -1;
        lgStraight = -1;
    }

    /* 1. If the field is already full, return false
       2. Set data value ones equal to number of ones rolled multiplied by one.
       3. Update the bonus (call updateBonus())
       4. Return true   */
    public boolean markOnes(int die1, int die2, int die3, int die4, int die5) {
        int numones = 0;
        boolean output = true;
        if (ones == -1) {
            if (die1 == 1) {
                numones+=1;
            }
            if (die2 == 1) {
                numones+=1;
            }
            if (die3 == 1) {
                numones+=1;
            }
            if (die4 == 1) {
                numones+=1;
            }
            if (die5 == 1) {
                numones+=1;
            }
        } else {
            output = false;
        }
        this.ones = numones;
        return output;
    }

    /* 1. If the field is already full, return false
       2. Set data value twos equal to number of twos rolled multiplied by two.
       3. Update the bonus (call updateBonus())
       4. Return true   */
    public boolean markTwos(int die1, int die2, int die3, int die4, int die5) {
        int numtwoes = 0;
        boolean output = true;
        if (twos == -1) {
            if (die1 == 2) {
                numtwoes += 2;
            }
            if (die2 == 2) {
                numtwoes += 2;
            }
            if (die3 == 2) {
                numtwoes += 2;
            }
            if (die4 == 2) {
                numtwoes += 2;
            }
            if (die5 == 2) {
                numtwoes += 2;
            }
        } else {
            output = false;
        }
        this.twos = numtwoes;
        return output;
    }

    /* 1. If the field is already full, return false
       2. Set data value threes equal to number of threes rolled multiplied by three.
       3. Update the bonus (call updateBonus())
       4. Return true  */
    public boolean markThrees(int die1, int die2, int die3, int die4, int die5) {
        int numthrees = 0;
        boolean output = true;
        if (threes == -1) {
            if (die1 == 3) {
                numthrees += 3;
            }
            if (die2 == 3) {
                numthrees += 3;
            }
            if (die3 == 3) {
                numthrees += 3;
            }
            if (die4 == 3) {
                numthrees += 3;
            }
            if (die5 == 3) {
                numthrees += 3;
            }
        } else {
            output = false;
        }
        this.threes = numthrees;
        return output;
    }

    /* 1. If the field is already full, the method returns false
       2. Sets data value fours equal to number of fours rolled multiplied by four.
       3. Update the bonus (call updateBonus())
       4. Returns true   */
    public boolean markFours(int die1, int die2, int die3, int die4, int die5) {
        int numfours = 0;
        boolean output = true;
        if (fours == -1) {
            if (die1 == 4) {
                numfours += 4;
            }
            if (die2 == 4) {
                numfours += 4;
            }
            if (die3 == 4) {
                numfours += 4;
            }
            if (die4 == 4) {
                numfours += 4;
            }
            if (die5 == 4) {
                numfours += 4;
            }
        } else {
            output = false;
        }
        this.fours = numfours;
        return output;
    }

    /* 1. If the field is already full, the method returns false
       2. Sets data value fives equal to number of fives rolled multiplied by five.
       3. Update the bonus (call updateBonus())
       4. Returns true   */
    public boolean markFives(int die1, int die2, int die3, int die4, int die5) {
        int numfives = 0;
        boolean output = true;
        if (fives == -1) {
            if (die1 == 5) {
                numfives += 5;
            }
            if (die2 == 5) {
                numfives += 5;
            }
            if (die3 == 5) {
                numfives += 5;
            }
            if (die4 == 5) {
                numfives += 5;
            }
            if (die5 == 5) {
                numfives += 5;
            }
        } else {
            output = false;
        }
        this.fives = numfives;
        return output;
    }

    /* 1. If the field is already full, the method returns false
       2. Sets data value sixes equal to number of sixes rolled multiplied by six.
       3. Update the bonus (call updateBonus())
       4. Returns true */
    public boolean markSixes(int die1, int die2, int die3, int die4, int die5) {
        int numsixes = 0;
        boolean output = true;
        if (sixes == -1) {
            if (die1 == 6) {
                numsixes += 6;
            }
            if (die2 == 6) {
                numsixes += 6;
            }
            if (die3 == 6) {
                numsixes += 6;
            }
            if (die4 == 6) {
                numsixes += 6;
            }
            if (die5 == 6) {
                numsixes += 6;
            }
        } else {
            output = false;
        }
        this.sixes = numsixes;
        return output;
    }

    /* 	1. If the field is already full, return false
        2. Check to see if there are actually three of the same value.
           If there are, set the data value threeKind to the value of all five dice.
           If there aren�t set the value to 0.
              (Hint: use YahtzeeSortDice class!)
           4. Return true   */
    public boolean markThreeOfAKind(int die1, int die2, int die3, int die4, int die5) {
        int threeofakind = 0;
        boolean output = true;
        YahtzeeSortDice sort = new YahtzeeSortDice(die1,die2,die3,die4,die5);
        if(threeKind == -1) {

            if (sort.getFirst() == sort.getSecond() && sort.getSecond() == sort.getThird()
                    || sort.getSecond() == sort.getThird() && sort.getThird() == sort.getFourth()
                    || sort.getThird() == sort.getFourth() && sort.getFourth() == sort.getFifth()) {
                threeofakind = die1+die2+die3+die4+die5;
            }else{
                threeofakind = 0;
            }
        }else{
            output = false;
        }
        this.threeKind = threeofakind;
        return output;
    }




    /* 	1. If the field is already full, return false
        2. Check to see if there are actually four of the same value.
           If there are, set the data value fourKind to the value of all five dice.
           If there aren�t set the value to 0;
           (Hint: use YahtzeeSortDice class!)
        4. Return true  */
    public boolean markFourOfAKind(int die1, int die2, int die3, int die4, int die5)
    {
        int fourofakind = 0;
        boolean output = true;
        YahtzeeSortDice sort = new YahtzeeSortDice(die1,die2,die3,die4,die5);
        if (fourKind == -1){
            if (sort.getFirst()==sort.getSecond()&&sort.getSecond()==sort.getThird()
                    &&sort.getThird()==sort.getFourth()||sort.getSecond()==sort.getThird()&&sort.getThird()==sort.getFourth()&&
                    sort.getFourth()==sort.getFifth()){
                fourofakind = die1+die2+die3+die4+die5;
            }else{
                fourofakind = 0;
            }
        }else{
            output = false;
        }
        this.fourKind = fourofakind;
        return output;
    }

    /* 1. If the field is already full, return false
       2. Check to see if there are actually three die with the same value, and two with another value.
          If there are, set the data value fullHouse to 25.
          If there aren�t set the value to 0.
          (Hint: Use YahtzeeSortedDice class!)
       3. Return true   */
    public boolean markFullHouse(int die1, int die2, int die3, int die4, int die5)
    {
        int fullofahouse = 0;
        boolean output = true;
        YahtzeeSortDice sort = new YahtzeeSortDice(die1,die2,die3,die4,die5);
        if(fullHouse == -1) {

            if (sort.getFirst() == sort.getSecond() && sort.getThird() == sort.getFourth() && sort.getFourth() == sort.getFifth()
                    || sort.getFirst() == sort.getSecond() && sort.getSecond() == sort.getThird() && sort.getFourth() == sort.getFifth()) {
                fullofahouse = 25;
            } else {
                fullofahouse = 0;
            }
        }else{
            output = false;
        }
        this.fullHouse = fullofahouse;
        return output;
    }

    /* 	1. If the field is already full, return false
        2. Check to see if there are actually four consecutive dice numbers.
           If there are, set the data value smStraight to 30.
           If there aren�t set the value to 0.
           (Hint: Use YahtzeeSortedDice class)
        4. Return true  */
    public boolean markSmallStraight(int die1, int die2, int die3, int die4, int die5)
    {
        int smallstraight = 0;
        int hasOne = 0;
        int hasTwo = 0;
        int hasThree = 0;
        int hasFour = 0;
        int hasFive = 0;
        int hasSix = 0;
        boolean output = true;
        YahtzeeSortDice sort = new YahtzeeSortDice(die1,die2,die3,die4,die5);
        if(smStraight == -1){
            if(sort.getFirst()==1){
                hasOne+=1;
            }if(sort.getFirst()==2||sort.getSecond()==2){
                hasTwo+=1;
            }if(sort.getSecond()==3||sort.getThird()==3||sort.getFourth()==3||sort.getFirst()==3){
                hasThree+=1;
            }if(sort.getThird()==4||sort.getFourth()==4||sort.getFifth()==4||sort.getSecond()==4){
                hasFour+=1;
            }if(sort.getFourth()==5||sort.getFifth()==5||sort.getThird()==5){
                hasFive+=1;
            }if(sort.getFifth()==6){
                hasSix+=1;
            }if((hasOne==1&&hasTwo==1&&hasThree==1&&hasFour==1)||(hasTwo==1
                    &&hasThree==1&&hasFour==1&&hasFive==1)||(hasThree==1&&hasFour==1&&hasFive==1&&hasSix==1)){
                smallstraight= 30;
            }else{
                smallstraight = 0;
            }
        }else{
            output = false;
        }
        this.smStraight = smallstraight;
        return output;
    }

    /* 	1. If the field is already full, return false
        2. Check to see if there are actually five consecutive dice numbers.
           If there are, set the data value lgStraight to 40.
           If there aren�t set the value to 0;
           (Hint: use YahtzeeSortDice class!)
        3. Return true  */
    public boolean markLargeStraight(int die1, int die2, int die3, int die4, int die5)
    {
        int largestraight = 0;
        boolean output = true;
        YahtzeeSortDice sort = new YahtzeeSortDice(die1,die2,die3,die4,die5);
        if(lgStraight == -1){
            if(sort.getFirst()+1==sort.getSecond()&&sort.getSecond()+1==sort.getThird()&&sort.getThird()+1==sort.getFourth()&&
                    sort.getFourth()+1==sort.getFifth()){
                largestraight = 40;
            }else{
                largestraight = 0;
            }
        }else{
            output = false;
        }
        this.lgStraight = largestraight;
        return output;
    }

    /* 1. If the field is already full, return false
       2. Checks to see if there are actually five of the same value.  If there are, set the data value fiveKind to 50.  If there aren�t set the value to 0;
       3. Return true   */
    public boolean markYahtzee(int die1, int die2, int die3, int die4, int die5)
    {
        int Yahtzee = 0;
        boolean output = true;
        YahtzeeSortDice sort = new YahtzeeSortDice(die1,die2,die3,die4,die5);
        if(fiveKind == -1){
            if(sort.getFirst()==sort.getFifth()){
                Yahtzee=50;
            }else{
                Yahtzee = 0;
            }
        }else {
            output = false;
        }
        this.fiveKind = Yahtzee;
        return output;
    }

    /* 1. If the field is already full, return false
       2. Set the data value chance to the value of all five dice.
       3. Return true  */
    public boolean markChance(int die1, int die2, int die3, int die4, int die5)
    {
        int chanceis = 0;
        boolean output = true;
        if(chance == -1){
            chanceis = die1+die2+die3+die4+die5;
        }else{
            output = false;
        }
        this.chance= chanceis;
        return output;
    }

    /* 	1. If the bonus has already been assigned, do nothing
        2. If the upper section�s total is 63 or greater, set the data value bonus to true */
    private void updateBonus()
    {
        if(bonus==false){
            if((this.getUpperTotal())>=63){
                bonus = true;
            }else{
                bonus = false;
            }
        }
    }

    /* 	returns the upper total, remember incompletes (-1s) should not be factored in! */
    public int getUpperTotal()
    {
        int uppertotal = 0;
        if(ones >= 0){
            uppertotal+=ones;
        }if(twos >= 0){
        uppertotal+=twos;
    }if (threes >= 0){
        uppertotal+=threes;
    }if(fours >= 0){
        uppertotal+=fours;
    }if(fives >= 0){
        uppertotal+=fives;
    }if(sixes >= 0){
        uppertotal+=sixes;
    }
        return uppertotal;
    }

    /* 	returns the lower total, remember incompletes (-1s) should not be factored in! */
    public int getLowerTotal()
    {
        int lowerTotal = 0;
        if(threeKind>=0){
            lowerTotal+=threeKind;
        }if(fourKind>=0){
        lowerTotal+=fourKind;
    }if(fullHouse>=0){
        lowerTotal+=fullHouse;
    }if(smStraight>=0){
        lowerTotal+=smStraight;
    }if(lgStraight>=0){
        lowerTotal+=lgStraight;
    }if(fiveKind>=0){
        lowerTotal+=fiveKind;
    }if(chance>=0){
        lowerTotal+=chance;
    }
        return lowerTotal;
    }

    /* 	returns the grand total, remember incompletes (-1s) should not be factored in! */
    public int getGrandTotal()
    {
        return this.getUpperTotal()+this.getLowerTotal();
    }

    /*	Prints a scorecard with the current total, using "__" to mark uncompleted fields and a number to mark filled fields
        Sample:
        **********************************
        *  	    Yahtzee Score Card		 *
        *  					`		  	 *
        * 	Ones:				__		 *
        * 	Twos:				__		 *
        * 	Threes:				__		 *
        * 	Fours:				__		 *
        * 	Fives:				25		 *
        * 	Sixes:				__		 *
        *								 *
        *	Upper Bonus:		 0		 *
        * 	Upper Total:   		25		 *
        *								 *
        *	3 of Kind:			__		 *
        * 	4 of Kind:			__		 *
        * 	Full House:			25		 *
        * 	Sm Straight:		__		 *
        * 	Lg  Straight:		__		 *
        * 	Yahtzee:	  		 0		 *
        * 	Chance:				__		 *
        *								 *
        * 	Lower Total:		25		 *
        *								 *
        * 	Grand Total:		50		 *
        **********************************
        already implemented
    */
    public void printScoreCard()
    {
        System.out.println();
        System.out.println("*********************************");
        System.out.println("*      Yahtzee Score Card       *");
        System.out.println("*                               *");
        System.out.print("*  Ones:\t\t");
        if(ones==-1)System.out.print("__");
        else System.out.print(ones);
        System.out.println("\t*");
        System.out.print("*  Twos:\t\t");
        if(twos==-1)System.out.print("__");
        else System.out.print(twos);
        System.out.println("\t*");
        System.out.print("*  Threes:\t\t");
        if(threes==-1)System.out.print("__");
        else System.out.print(threes);
        System.out.println("\t*");
        System.out.print("*  Fours:\t\t");
        if(fours==-1)System.out.print("__");
        else System.out.print(fours);
        System.out.println("\t*");
        System.out.print("*  Fives:\t\t");
        if(fives==-1)System.out.print("__");
        else System.out.print(fives);
        System.out.println("\t*");
        System.out.print("*  Sixes:\t\t");
        if(sixes==-1)System.out.print("__");
        else System.out.print(sixes);
        System.out.println("\t*");
        System.out.println("*\t\t\t\t*");
        System.out.print("*  Upper Bonus:\t\t");
        if(bonus)System.out.print("35");
        else System.out.print("0");
        System.out.println("\t*");
        System.out.print("*  Upper Total:\t\t");
        System.out.print(this.getUpperTotal());
        System.out.println("\t*");
        System.out.println("*                               *");
        System.out.print("*  3 of Kind:\t\t");
        if(threeKind==-1)System.out.print("__");
        else System.out.print(threeKind);
        System.out.println("\t*");
        System.out.print("*  4 of Kind:\t\t");
        if(fourKind==-1)System.out.print("__");
        else System.out.print(fourKind);
        System.out.println("\t*");
        System.out.print("*  Full House:\t\t");
        if(fullHouse==-1)System.out.print("__");
        else System.out.print(fullHouse);
        System.out.println("\t*");
        System.out.print("*  Sm Straight:\t\t");
        if(smStraight==-1)System.out.print("__");
        else System.out.print(smStraight);
        System.out.println("\t*");
        System.out.print("*  Lg Straight:\t\t");
        if(lgStraight==-1)System.out.print("__");
        else System.out.print(lgStraight);
        System.out.println("\t*");
        System.out.print("*  Yahtzee:\t\t");
        if(fiveKind==-1)System.out.print("__");
        else System.out.print(fiveKind);
        System.out.println("\t*");
        System.out.print("*  Chance:\t\t");
        if(chance==-1)System.out.print("__");
        else System.out.print(chance);
        System.out.println("\t*");
        System.out.println("*                               *");
        System.out.print("*  Lower Total:\t\t");
        System.out.print(this.getLowerTotal());
        System.out.println("\t*");
        System.out.println("*                               *");
        System.out.print("*  Grand Total:\t\t");
        System.out.print(this.getGrandTotal());
        System.out.println("\t*");
        System.out.println("**********************************");
        System.out.println();
    }
}
