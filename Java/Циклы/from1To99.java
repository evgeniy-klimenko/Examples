/**
 * Created by Berserk on 09.09.2016.
 */
public class from1To99 {
    public static void main(String[] args){
        int i = 1;
        int sum = 0;
        while(i < 100){
            if ((i%2) == 0)
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
}
