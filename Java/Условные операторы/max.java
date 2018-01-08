/**
 * Created by Berserk on 09.09.2016.
 */
import java.util.Scanner;
public class max {
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        System.out.println("Введите число а:");
        int a = Integer.parseInt(n.nextLine());
        System.out.println("Введите число б: ");
        int b = Integer.parseInt(n.nextLine());
        System.out.println("Введите число в: ");
        int c = Integer.parseInt(n.nextLine());
        int f = a*b*c;
        int d = a+b+c;
        System.out.println(Math.max(f,d)+3);



    }
}
