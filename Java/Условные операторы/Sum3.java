import java.util.Scanner;

/**
 * Created by Berserk on 08.09.2016.
 */
public class Sum3 {
    public static void main (String[] args){
        Scanner n = new Scanner(System.in);
        System.out.println("Введите число: ");
        int f = Integer.parseInt(n.nextLine());
        System.out.println("Введите число: ");
        int s = Integer.parseInt(n.nextLine());
        System.out.println("Введите число: ");
        int t = Integer.parseInt(n.nextLine());
        if (f >= 0 && s >= 0 && t >= 0){
            System.out.println(f+s+t);
        }
        else if (f >= 0 && s>= 0 && t<=0){
            System.out.println(f+s);
        }
        else if (f >= 0 && s <= 0 && t >= 0){
            System.out.println(f+t);
        }
        else if (f <= 0 && s >= 0 && t >= 0){
            System.out.println(s+t);
        }
        else if (f >= 0 && s <=0 && t >= 0){
            System.out.println(f);
        }
        else if (f <= 0 && s >= 0 && t <= 0){
            System.out.println(s);
        }
        else if (f <= 0 && s <= 0 && t>=0){
            System.out.println(t);
        }
    }
}
