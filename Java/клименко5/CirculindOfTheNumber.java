import java.util.Scanner;

/**
 * Created by Berserk on 14.09.2016.
 */
public class CirculindOfTheNumber {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Введите число с ненулевой дробной частью: ");
        float n = Float.parseFloat(number.nextLine());
        float f = (int)n;
        float ff = n - f;// чтобы округлить число достаточно использовать функцию Math.round(n)
        if(ff >= 0.5){

            System.out.println(f+1);
        }
        else{
            System.out.println(n - ff);
        }
    }
}
