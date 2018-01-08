package Stringss;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Berserk on 15.10.2016.
 */
public class URLString {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter URL address: ");
        String url = n.nextLine();
        checker(url);

    }

    private static void checker(String url) {
        String regexp = "^((https|http)\\:\\/\\/)([www]{1})((\\.[a-z0-9-])|([a-z0-9-]))\\.([a-z]{2,6})(\\/)$";
        Pattern pattern = Pattern.compile(regexp);
        Matcher matcher = pattern.matcher(url);
        System.out.println(matcher.matches());
    }
}
