import java.util.Scanner;

/**
 * Created by Berserk on 13.09.2016.
 */
public class Root {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Введите число: ");
        double root = Double.parseDouble(n.nextLine());
        double result = Math.sqrt(root);
        System.out.println("Результат: " + result);
    }
}
