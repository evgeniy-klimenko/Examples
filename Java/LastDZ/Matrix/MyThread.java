package LastDZ.Matrix;


public class MyThread implements Runnable{
    int [][]ar1;
    int [][]ar2;
    int [][] ar3;
    int index1;
    int index2;
    int sum;

    public MyThread(int ar1[][], int ar2[][], int ar3[][], int index1, int index2){
        this.ar1 = ar1;
        this.ar2 = ar2;
        this.ar3 = ar3;
        this.index1 = index1;
        this.index2 = index2;
        sum = ar2.length;
    }

    public MyThread(int i, int i1, int i2, int index, int index2) {

    }


    public void calculate(int i, int j) {
        int s = 0;
        for (int f = 0; f < sum; f++) {
            s += ar1[i][f] * ar2[f][j];
            ar3[i][j] = s;
        }
    }

        @Override
        public void run(){
            System.out.println("Calculating!");
            int count = ar2[0].length;
            for (int i = 0; i < index2; index1++){
                calculate(i/count, i % count);
            }
            System.out.println("Finish!");
    }


































}
