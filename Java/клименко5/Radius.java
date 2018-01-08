import java.util.Scanner;

/**
 * Created by Berserk on 15.09.2016.
 */
public class Radius {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        double pi = 3.14;
        System.out.println("Введите радиус: ");
        double radius = Double.parseDouble(number.nextLine());
        double area = pi*(radius*radius);// можно использовать Math.pow(radius, 2)
        System.out.println("Площадь круга равна: " + area);
    }
}
