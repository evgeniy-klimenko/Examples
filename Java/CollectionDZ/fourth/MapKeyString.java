package CollectionsDZ.first.fourth;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapKeyString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter word: ");
        String string = scanner.nextLine();

        Map<Integer, String> map = new HashMap<>();
        map.put(string.length(), string);

        for (Map.Entry<Integer, String> entry : map.entrySet()) {

            System.out.print(entry.getKey() + " ");
            System.out.println(entry.getValue());

        }

    }
}

