package Stringss;
import java.util.Scanner;

/**
 * Created by Berserk on 13.10.2016.
 */
public class ArrayWithStringLength {

    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int size = Integer.parseInt(number.nextLine());
        System.out.println("Enter array: ");
        String [] array = new String[size];



        for (int i = 0; i < size; i++) {
            y[i] = number.nextLine();
        }   arra

        for (String sout : array){
            System.out.println(sout);
        }
        System.out.println(array.length);
        comparator(array);
    }

    static void comparator(String[] array) {
        int maxStringIndex = 0;
        String maxString = array[maxStringIndex];
        int maxLength = array[maxStringIndex].length();

        for (int j = 1; j < array.length; j++){
            int maxlength2 = array[j].length();
            if (maxLength < maxlength2) {
                maxStringIndex = j;
                maxString = array[j];
            } else{
                    maxStringIndex = maxStringIndex;
                    maxString = array[maxStringIndex];
                }
            }
            System.out.printf("\n The longest string in array is: %s", maxString);
        }

    }

