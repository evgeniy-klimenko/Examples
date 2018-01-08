import java.util.Scanner;

/**
 * Created by Berserk on 14.09.2016.
 */
public class SumOfTheNumber {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Введите двухзначное число: ");
        int h = Integer.parseInt(number.nextLine());
        int t = h/10;
        int tt = h%10;
        int result = t + tt;
        System.out.println(t);
        System.out.println(tt);
        System.out.println("Результат: " + result);


    }
}
