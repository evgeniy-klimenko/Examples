package Stringss;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Berserk on 15.10.2016.
 */
public class ChangingEncoding {
    public static void main(String[] args) throws UnsupportedEncodingException {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter the word: ");
        String word = n.nextLine();
        System.out.println("Enter type of encode: ");
        String encode = n.nextLine();
        byte [] firstencode = word.getBytes(encode);

        System.out.println("Enter type of changed encode: ");
        String changedencode = n.nextLine();

        System.out.println("Original encode array: " + Arrays.toString(firstencode));
        changingEncode(firstencode, encode, changedencode);
    }

    private static void changingEncode(byte[] firstencode, String encode, String changedencode) throws UnsupportedEncodingException {
            byte [] changencoe = firstencode;
            byte [] changedencoe = encode.getBytes(changedencode);
        System.out.printf("Changing encode from %s to %s\n", encode, changedencode);

        System.out.println("Changed encode array: " + Arrays.toString(changedencoe));
    }
}
