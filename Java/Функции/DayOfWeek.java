import java.util.Scanner;

/**
 * Created by Berserk on 13.09.2016.
 */
public class DayOfWeek {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
       final String  one = "Понедельник" ;
       final String  two = "Вторник" ;
       final String  three = "Среда" ;
       final String  four = "Четверг" ;
       final String  five = "Пятница" ;
       final String  six = "Суббота" ;
       final String  seven = "Воскресенье" ;
        System.out.println("Введите номер дня недели:");
        int a = Integer.parseInt(n.nextLine());
        if (a == 1){
            System.out.println(one);
        }
         else if (a == 2){
             System.out.println(two);
        }
        else if (a == 3){
            System.out.println(three);
        }
        else if (a == 4){
            System.out.println(four);
        }
        else if (a == 5){
            System.out.println(five);
        }
        else if (a == 6){
            System.out.println(six);
        }
        else if (a == 7){
            System.out.println(seven);
        }
        else{
            System.out.println("Введите число от 1 до 7");
        }




    }
}
