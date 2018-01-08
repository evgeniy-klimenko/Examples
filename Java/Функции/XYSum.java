import java.util.Scanner;

/**
 * Created by Berserk on 13.09.2016.
 */
public class XYSum {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Введите значение первой точки: ");
        double x1 = Double.parseDouble(n.nextLine());
        double y1 = Double.parseDouble(n.nextLine());
        System.out.println("Введите значение второй точки: ");
        double  x2  = Double.parseDouble(n.nextLine());
        double  y2  = Double.parseDouble(n.nextLine());
        double result = Math.sqrt(Math.pow((x2 - x1), 2)+ Math.pow((y2 - y1), 2));
        System.out.println("Расстояние равно: " + result);
    }
}
