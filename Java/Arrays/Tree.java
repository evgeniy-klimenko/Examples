package Arrays;
/* Если не использовать переменные в конструктора Tree, а использовать System.out.println(name + heigth)
то выводится нормальный массив
Если использововать переменные в конструкторе Tree, без System.out.println(name + heigth), и использовать foreach
то выводиться непонятный набор символов, никак не могу понять в чем проблема.
*/
public class Tree{
    final static String DEFAULTTREE = "Росток";
    final static int DEFAULTHEIGTH = 5;
    static int counter = 0;
    String name;
    int heigth;


    Tree(String name, int heigth){
        String nn = new String(name);
        int hh = heigth;
        System.out.println(name+heigth);
    }

    Tree(String name){
        String na = new String(name);
        System.out.println(na+this.heigth);
       System.out.println(name);
    }

}
