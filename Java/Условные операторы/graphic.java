import com.sun.org.apache.xpath.internal.SourceTree;
import java.util.Scanner;
/**
 * Created by Berserk on 07.09.2016.
 */
public class graphic {
 public static void main (String[] args){
     Scanner n = new Scanner(System.in);
     System.out.println("Введите координаты точки x : ");
     int x = Integer.parseInt(n.nextLine());
     System.out.println("Введите координаты точки y : ");
     int y = Integer.parseInt(n.nextLine());
     if (x>=0 && y>=0){
         System.out.println("Точка находится в 1 четверти.");
     }
     else if (x >= 0 && y <= 0){
         System.out.println("Точка находится в 4 четверти.");
     }
     else if(x <= 0 && y <= 0){
         System.out.println("Точка находится в 3 четверти.");
     }
     else if (x <=0 && y>= 0){
         System.out.println("Точка находится во 2 четверти.");
     }
 }
}
