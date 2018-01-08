import java.util.Scanner;

/**
 * Created by Berserk on 07.09.2016.
 */
public class Operands1 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Введите число a : ");
        int a = Integer.parseInt(n.nextLine());
        System.out.print("Введите число b : ");
        int b = Integer.parseInt(n.nextLine());
        int c = a * b;
        int d = a + b;
        if ((a % 2) == 0) {
            System.out.println(c);
        } else

        {
            System.out.println(d);
        }
    }
}