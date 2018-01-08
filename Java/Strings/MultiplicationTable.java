package Stringss;

/**
 * Created by Berserk on 16.10.2016.
 */
public class MultiplicationTable {
    public static void main(String[] args) {
        double [][] table = new double[10][10];
        for(int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++){
                table[i][j] = Math.sqrt((i + 1) * (j + 1));
                System.out.printf("%1$-4.4f \n", table[i][j]);
            }
            System.out.println();

        }
    }
}
