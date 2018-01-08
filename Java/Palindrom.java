import java.util.Scanner;

/**
 * Created by Berserk on 24.09.2016.
 */
public class Palindrom {
    public static void main(String[] args) {
    Scanner n = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num = Integer.parseInt(n.nextLine());
        number(num);
        System.out.println("Введите слово: ");
        String word = n.nextLine();

        stringret(word);
}

    private static void number(int n) {
        if (n <= 10) {
            System.out.println("Число " + n + " не является палиндромом");
        } else if (n <= 99) {
            int des = n / 10;
            int ed = n % 10;
            if (des == ed) {
                System.out.println("Число " + n + " является палиндромом");
            } else {
                System.out.println("Число " + n + " не является палиндромом");
            }
        }
            else if (n >= 100 && n <= 999) {
            int sot = n / 100;
            int ostsot = n % 100;
            int des1 = ostsot / 10;
            int ostdes = ostsot % 10;

            if (sot == ostdes) {
                System.out.println("Число " + n + " является полиндромом");

            } else {
                System.out.println("Число " + n + " не является палиндромом");
            }

        }
            else if (n >= 1000 && n <= 9999) {
            int tus = n / 1000;
            int osttus = n % 1000;
            int sot1 = osttus / 100;
            int ostsot1 = osttus % 100;
            int des2 = ostsot1 / 10;
            int ostdes1 = ostsot1 % 10;
            if (tus == ostdes1 && sot1 == des2) {
                System.out.println("Число " + n + " является палиндромом");
            } else {
                System.out.println("Число " + n + " не является палиндромом");
            }


        }
    }

    public static void stringret(String word){

        String s = word;
        int l = s.length();
        if (s.charAt(0) == s.charAt(l) && s.charAt(1) == s.charAt(l-1) && s.charAt(2) == s.charAt(l-2)){
            System.out.println("Строка " + word + " является полиндромом");
        }
        else {
            System.out.println("Not yet");
        }


    }
}

