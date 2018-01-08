package Arrays;
import java.util.Arrays;

public class Change {

    public static void main(String[] args) {

        int n = 7;
        int[] first = new int[n];
        for (int i = 0; i < n ; i++) {
            first[i] = i;
        }

        System.out.println(Arrays.toString(first));
        String[][] array = new String[n][];

        changinTOstring(first, array);
    }

     static void changinTOstring(int[] first, String[][] array) {
         int f = first.length;
         int a = array.length;

         String[][] ar = new String[f][a];
         for (int i = 0; i < f; i++) {
             for (int j = 0; j < a; j++) {
                 ar [i][j] = "" + i + j;

             }
         }

         System.out.println(Arrays.deepToString(ar));

     }

}
