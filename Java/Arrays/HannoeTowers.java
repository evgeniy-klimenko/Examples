package Arrays;
public class HannoeTowers {

        static int firstnumber = 3;
        static int secondnumber = 6;
        static int thirdnumber = 9;

    public static void main(String[] args) {
            fullfirststick(firstnumber,secondnumber,thirdnumber);
    }


    static void fullfirststick(int firstnumber, int secondnumber, int thirdnumber) {
        System.out.println("First Stick | " + firstnumber + " " + secondnumber + " " + thirdnumber);
            thirdstick(thirdnumber);
    }

    static void first(int firstnumber) {
        System.out.println(firstnumber);
    }

    static void second(int secondnumber) {
        System.out.println(secondnumber);
    }

    static void third(int thirdnumber) {
        System.out.println(thirdnumber);
    }

    static void firststick(int thirdnumber) {//9
        third(thirdnumber);
        second(secondnumber);
        first(firstnumber);
        fullthirdstick(firstnumber,secondnumber,thirdnumber);

    }

    static void secondstick(int secondnumber) {//6
        second(secondnumber);
        firststick(thirdnumber);
    }

    static void thirdstick(int firstnumber) {//3
        third(firstnumber);
        secondstick(secondnumber);
    }

    static void fullthirdstick(int firstnumber, int secondnumber, int thirdnumber) {
        System.out.println("Third Stick | " + firstnumber + " " + secondnumber + " " + thirdnumber);
    }
}
