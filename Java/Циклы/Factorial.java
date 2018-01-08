/**
 * Created by Berserk on 07.09.2016.
 */
import java.util.Scanner;
public class Factorial {
    public static void main (String[] args){
        Scanner n = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = Integer.parseInt(n.nextLine());
        int factorial = 1;
        int i = 1;
        while(i <= number){
            factorial *=i;
            i++;
        }
        System.out.println("Факториал числа "+number+" равен " + factorial);
    }
}
