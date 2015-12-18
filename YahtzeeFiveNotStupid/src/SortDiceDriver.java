import java.util.Random;

/**
 * Created by nfrederick18 on 12/18/15.
 */
public class SortDiceDriver {

    public static void main(String[] args) {
        Random r = new Random();
        int a = r.nextInt(10)+1;
        int b = r.nextInt(10)+1;
        int c = r.nextInt(10)+1;
        int d = r.nextInt(10)+1;
        int e = r.nextInt(10)+1;
        YahtzeeSortDice sort = new YahtzeeSortDice(a,b,c,d,e);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(sort.getFirst()+ "\t"+sort.getSecond()+
                "\t"+sort.getThird()+ "\t"+sort.getFourth()+ "\t"+sort.getFifth()+ "\t");
    }
}
