package CollectionsDZ.first.fifth;

import java.util.Arrays;
import java.util.LinkedList;

import java.util.Scanner;



public class MyStack {

    public MyStack (int size) {
        int maxSize = size;
    }

    private static boolean add(int size, int sizeoflist) {
        if (sizeoflist == size){
            return true;
        }else if(sizeoflist < size){
            return true;
        }else {
            return false;
        }
    }

    private static boolean took() {
        return false;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter size of Stack: ");
        int size = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter size of List: ");
        int sizeoflist = Integer.parseInt(scanner.nextLine());



        LinkedList<Integer> linkedList = new LinkedList<>();
        if (sizeoflist == 0) {
                took();
        } else {

            if (sizeoflist == size || sizeoflist < size) {
                System.out.print("List IN: ");
                for (int i = 0; i < sizeoflist; i++) {
                    linkedList.add(i, i);
                    System.out.print(" " + linkedList.getLast());
                    add(size, sizeoflist);

                }
                System.out.print(" List OUT: ");
                for (int i = sizeoflist - 1; i >= 0; i--){
                    linkedList = new LinkedList<>();
                    linkedList.add(0, i);
                    System.out.print(" " + linkedList.getLast());
                }
            } else if (sizeoflist > size) {
                add(size, sizeoflist);
            }

        }


    }


}
