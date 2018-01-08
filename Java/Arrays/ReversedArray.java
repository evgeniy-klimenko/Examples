package Arrays;
import java.util.Arrays;

public class ReversedArray {

    public static void main(String[] args) {

        int strings = 5;
        int collums = 3;

        int [][] first = new int[strings][collums];
        for (int i = 0; i < strings; i++){
            for (int j = 0; j < collums; j++){
               first[i][j] =  i + j;

            }
        }
        System.out.println(Arrays.deepToString(first));
        System.out.println("Reverse array: ");
        reverse(strings,collums);

   }

    static void reverse(int strings, int collums) {
        int [][] second = new int[collums][strings];
        for (int j = 0; j < collums; j++){
            for (int i = 0; i < strings; i++){
                second[j][i] = j + i;

            }
        }

        System.out.println(Arrays.deepToString(second));
    }

}
