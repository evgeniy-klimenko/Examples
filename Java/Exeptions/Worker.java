package ExeptionDZ.ThreeClassesOfExeptions;


import java.util.Random;

public class Worker {
    static Random random = new Random();
    static int rand = random.nextInt(2);

static void  work() {

    switch (rand) {
        case 0:
            MyUncheckedExeption uncheckedExeption = new MyUncheckedExeption();
            throw uncheckedExeption;

        case 1:
            break;
    }
}
    static void close() throws MyCheckedExeption {
        switch (rand) {
            case 1:
                MyCheckedExeption checkedExeption = new MyCheckedExeption();
                throw checkedExeption;

            case 0:
                break;
        }
    }



    }



