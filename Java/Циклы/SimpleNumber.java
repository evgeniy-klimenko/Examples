import java.util.Scanner;
public class SimpleNumber {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Введите число: ");
        double g = Double.parseDouble(n.nextLine());
        if ((g % g) == 0 && (g%1) == 0 && (g % 2) == 1){
            System.out.println("Число является простым");
        }
        else {
            System.out.println("Число не является простым");
        }


    }
}
