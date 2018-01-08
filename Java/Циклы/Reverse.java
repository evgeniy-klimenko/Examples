import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by Berserk on 13.09.2016.
 */
public class Reverse {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Введите число: ");
        String number = n.nextLine();
        int l = number.length();
        int f = l-1;
        while(f >= 0){
            System.out.print(number.charAt(f));
            f--;
        }


    }
}
