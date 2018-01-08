/**
 * Created by Berserk on 22.09.2016.
 */
public class CreditOnTV {

    public static void main(String[] args) {
    percent(20000, 10.5);
    }

    private static void percent(int i, double v) {
        int c = i;
        double p = v;
        double result = (((i / 12) / v) + (i / 12)) * 12;
        System.out.println(result);
        System.out.println("Переплата на " + (result - i));


    }


}

