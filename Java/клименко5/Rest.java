import java.util.Scanner;

/**
 * Created by Berserk on 14.09.2016.
 */
public class Rest {
    public static void main(String[] args){
        Scanner number = new Scanner(System.in);
        System.out.println("Введите X: ");
        int x = Integer.parseInt(number.nextLine());
        System.out.println("Введите У: ");
        int y = Integer.parseInt(number.nextLine());
        division(x,y);

    }

    public static double division(int x, int y){
        double result = (double)x/(double)y;
        System.out.println("Результат: " + result);
        return result;
    }
}
