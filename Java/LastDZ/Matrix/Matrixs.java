package LastDZ.Matrix;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Matrixs {

    public static Random random = new Random();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter size of two matrix, amount of columns in the first matrix equal to rows in the second.");
        System.out.println("Enter rows for the first matrix: ");
        int i = scanner.nextInt();
        System.out.println("Enter columns for the first matrix: ");
        int j1 = scanner.nextInt();
        System.out.println("Enter rows for the second matrix: ");
        int j2 = scanner.nextInt();
        System.out.println("Enter columns for the second matrix: ");
        int g = scanner.nextInt();
        System.out.println("Enter number of threads: ");
        int threads = scanner.nextInt();

            int ar1[][] = new int[i][j1];
            int ar2[][] = new int[j2][g];

            for (int f = 0; f < i; f++) {
                for (int t = 0; t < j1; t++) {
                    ar1[f][t] = random.nextInt(10);
                }
            }

            for (int f = 0; f < j2; f++) {
                for (int t = 0; t < g; t++) {
                    ar2[f][t] = random.nextInt(10);
                }
            }
            System.out.println(Arrays.deepToString(ar1));
            System.out.println(Arrays.deepToString(ar2));

            int rows = ar1.length;
            int columns = ar2.length;
            int ar3[][] = new int[rows][columns];

            int threadPerThread = (rows * columns) / threads;
            int index = 0;
            int index2 = threadPerThread;
            MyThread myThread[] = new MyThread[threads];

            for (int y = 0; y < threads; y++) {


                myThread[y] = new MyThread(ar1[i][j1], ar2[j2][g], ar3[rows][columns], index, index2);
                myThread[y].run();

            }

            System.out.println(Arrays.deepToString(ar3));


        }
}
