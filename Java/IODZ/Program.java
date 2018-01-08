package IODZ;


public class Program {

    public static void main(String[] args) {

        MyStringQueue queue = new MyStringQueue();

        queue.add("Hi");
        queue.add("Hello");
        queue.add("Bye");

        System.out.println(queue.get());






    }

}
