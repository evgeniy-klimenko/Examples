import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by Berserk on 16.09.2016.
 */
public class SchoolCanteen {
    public static void main(String[] args) {
        Scanner pupil = new Scanner(System.in);
        System.out.println("Введите колличество учеников: ");
        int firstclass = Integer.parseInt(pupil.nextLine());
        int pie = 1;
        double glass = 0.2;
        double milk = 0.9;
        // первое условие
        System.out.println("ПЕРВОЕ УСЛОВИЕ: 100% УЧЕНИКОВ ВЕСОМ МЕНЕЕ 30КГ");
        int pupillessthirty = firstclass;
        int usualpies = firstclass * (pie*2);
        double usualglasses = (firstclass * glass) / milk;
        double circul = (int)usualglasses;
        double diff = usualglasses - circul;
        if (diff >= 0.5){
            double more = circul + 1;
            System.out.println("Для учеников первого класса необходимо " + usualpies + " пирожков и " + more + " упаковок молока");
        }
        else if (diff <= 0.5){
            System.out.println("Для учеников первого класса необходимо " + usualpies + " пирожков и " + circul + " упаковок молока");
        }
        //// второе условие;
        System.out.println("ВТОРОЕ УСЛОВИЕ: 60% УЧЕНИКОВ ВЕСОМ МЕНЕЕ 30КГ");
        double pupilslesthirty = firstclass * 0.6;
        double plt = (int)pupilslesthirty;
        double difference = firstclass - plt;
        double normal = difference * pie;////
        double normalglasses = (difference * glass) / milk;
        double normalcircul = (int)normalglasses;///
        double normaldiff = normalglasses - normalcircul;/////////
        double less = plt * (pie * 2);///
        double lessglasses = (plt * glass) / milk;
        double lesscircul = (int)lessglasses;///
        double lessdiff = lessglasses - lesscircul;
        double sumpies = normal + less;
        double sumglases = normalcircul + lesscircul;

      //  if (normaldiff >= 0.5 && lessdiff >= 0.5 && normaldiff >= 1.5){
            double mor = sumglases + 1;
            System.out.println("Для учеников первого класса необходимо " + sumpies + " пирожков и " + mor + " упаковок молока");
        //}
        /*else if (normaldiff <= 0.5 && normaldiff <= 0.5 && lessdiff <= 0.5){
            System.out.println("Для учеников первого класса необходимо " + sumpies + " пирожков и " + sumglases + " упаковок молока");
        }*/
}
}