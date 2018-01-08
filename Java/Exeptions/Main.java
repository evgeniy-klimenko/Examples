package ExeptionDZ.ThreeClassesOfExeptions;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws MyCheckedExeption {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter number from 1 to 10: ");
        int number = n.nextInt();

        //checked exeption
        if (number > 5 && number < 7) {
            try {
                MyCheckedExeption mex = new MyCheckedExeption();
                throw new MyCheckedExeption();

            } catch (MyCheckedExeption e) {
                MyCheckedExeption ee = new MyCheckedExeption();
                throw ee;
            }
        }
        //unchecked exeption
        else if (number > 7 && number == 10) {
            try {
                MyUncheckedExeption mue = new MyUncheckedExeption();
                throw new MyUncheckedExeption();
            } catch (MyUncheckedExeption u) {
                MyUncheckedExeption ue = new MyUncheckedExeption();
                throw ue;
            }
        }
        //error
        else if (number < 1 && number < 11){
            MyErrorExeption meeo = new MyErrorExeption();
            throw meeo;

        }
    }
}



