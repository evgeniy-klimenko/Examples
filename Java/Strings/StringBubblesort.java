package Stringss;

import java.util.Scanner;

/**
 * Created by Berserk on 14.10.2016.
 */
public class StringBubblesort {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = Integer.parseInt(n.nextLine());
        System.out.printf("Enter %s strings: ", number);
        String[] array = new String[number];



        for (int i = number - 1; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                array[j] = n.nextLine();
                if (array[j].equals(array[j - 1])) {
                        String temp = array[j];
                        array[j] = array[j - 1];
                        array[j - 1] = temp;

                }
           }

                for (String s : array) {
                    System.out.println(s);
                }
        }
}
}
