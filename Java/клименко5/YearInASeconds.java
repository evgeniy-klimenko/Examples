import java.util.Scanner;

/**
 * Created by Berserk on 15.09.2016.
 */
public class YearInASeconds {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int second = 1;
        int minute = second*60;
        int hour = minute*60;
        int day = hour*24;
        int year = day*365;
       // System.out.println("Year in seconds: " + year);
       // System.out.println("Day in seconds: " + day);
       // System.out.println("Hour in seconds: " + hour);
       // System.out.println("Minute in seconds: " + minute);
        int minyear = year/60;
       // System.out.println("\nMinutes in year: " + minyear);
        int houyear = minyear/60;
        //System.out.println("Huors in year: " + houyear);
        int dayyear = houyear/24;
        //System.out.println("Days in year: " + dayyear);
        System.out.println("Введите время в секундах: ");
        int time = Integer.parseInt(n.nextLine());
        int minutes = time/60;
        int hours = minutes/60;
        int days = hours/24;
        if (time > year){
            System.out.println("Вы ввели слишком большое значение");
        }
        else {
            int leftseconds = year - time;
            System.out.println("Осталось секунд до нового года: " + leftseconds);
            int leftminutes = minyear - minutes;
            System.out.println("Осталось минут до нового года: " + leftminutes);
            int lefthours = houyear - hours;
            System.out.println("Осталось часов до нового года: " + lefthours);
            int leftdays = dayyear - days;
            System.out.println("Осталось дней до нового года: " + leftdays);

        }

    }
}
