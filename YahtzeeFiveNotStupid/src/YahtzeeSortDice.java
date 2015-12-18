/**
 * Created by nfrederick18 on 12/17/15.
 */
public class YahtzeeSortDice {

    int first;
    int second;
    int third;
    int fourth;
    int fifth;

    /* constructor: initializes the private data by sorting the order of the dice */
    public YahtzeeSortDice(int a, int b, int c, int d, int e)
    {
        first = a;
        second = b;
        third = c;
        fourth = d;
        fifth = e;

        int smallest = 0 ;
        if (first <= second && first <= third && first <= fourth && first <= fifth) {
            smallest = first;
        } else if (second <= first && second <= third && second <= fourth && second <= fifth) {
            smallest = second;
            second = first;
        } else if (third <= first && third <= second && third <= fourth && third <= fifth) {
            smallest = third;
            third = first;
        } else if (fourth <= first && fourth <= second && fourth <= third && fourth <= fifth) {
            smallest = fourth;
            fourth = first;
        } else if (fifth <= first && fifth <= second && fifth <= third && fifth <= fourth) {
            smallest = fifth;
            fifth = first;
        }
        this.first = smallest;


        int secsmallest = 0;
         if (second >= this.getFirst() && second <= third && second <= fourth && second <= fifth) {
            secsmallest = second;
        } else if (third >= this.getFirst() && third <= second && third <= fourth && third <= fifth) {
            secsmallest = third;
             third = second;
        } else if (fourth >= this.getFirst() && fourth <= second && fourth <= third && fourth <= fifth) {
            secsmallest = fourth;
             fourth = second;
        } else if (fifth >= this.getFirst() && fifth <= second && fifth <= third && fifth <= fourth) {
            secsmallest = fifth;
             fifth = second;
        }
        this.second = secsmallest;

        int thirdsmallest = 0;
         if (third >= this.getSecond() && third <= fourth && third <= fifth) {
            thirdsmallest = third;
        } else if (fourth >= this.getSecond() && fourth <= third && fourth <= fifth) {
            thirdsmallest = fourth;
             fourth = third;
        } else if (fifth >= this.getSecond() && fifth <= third && fifth <= fourth) {
            thirdsmallest = fifth;
             fifth = third;
        }
        this.third = thirdsmallest;

        int fourthsmallest = 0;
         if (fourth >= this.getThird() && fourth <= fifth) {
            fourthsmallest = fourth;
        } else if (fifth >= this.getThird() && fifth <= fourth) {
            fourthsmallest = fifth;
             fifth = fourth;
        }
        this.fourth = fourthsmallest;

        int largest = 0;
        if(fifth >= this.getFourth()){
            largest = fifth;
        }
        this.fifth = largest;

    }

    /* returns the minimum of the five numbers */
    public int getFirst() {

        return this.first;
    }

    /* returns the second smallest of the five number */
    public int getSecond() {
        return this.second;
    }

    /* returns the middle of the five numbers */
    public int getThird() {

        return this.third;
    }

    /* returns the second largest of the five numbers */
    public int getFourth() {

        return this.fourth;
    }

    /* returns the biggest of the five numbers */
    public int getFifth() {

        return this.fifth;
    }
}
