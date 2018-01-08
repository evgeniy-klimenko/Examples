import java.util.Scanner;

/**
 * Created by Berserk on 22.09.2016.
 */
public class WorkPayment {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Введите зарплату в час: ");
        int salary = Integer.parseInt(n.nextLine());
        if (salary < 8){
            System.out.println("Работник не может получать меньше 8 долларов в час.");
        }
        System.out.println("Введите количество проработаных часов: ");
        int time = Integer.parseInt(n.nextLine());
        if (time > 60){
            System.out.println("Работник не может работать больше, чем 60 часов в неделю.");
        }
        weekly(salary , time);
    }

    private static void weekly(int salary, int time) {
        int s = salary;
        int t = time;
        if (t > 40 && t < 60){
            double h = s / 2;
            int d = t - 40;
            double g = (40 * s) + (d * (s + h));
            System.out.println("Зарплата " + g);
        }
        else{
            int gg = t * s;
            System.out.println("Зарплата " + gg);
        }

    }


}
