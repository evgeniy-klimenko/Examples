package Collections.enumer.DZCollection;

public class TEstCOllection {

    public static void main(String[] args) {

        normalIterator();
        System.out.println("\n");
        reverseIterator();
        System.out.println();

        removeElement(6);
    }

    private static void removeElement(int i) {

    }


    public static void normalIterator(){
            INtegerCOllection collection = new INtegerCOllection(10);

            for (int i = 0; i < 14; i++) {
                collection.add(i);
            }

            System.out.println(collection);

            INtegerCOllection.Iterator iterator = collection.getIterator();

            while (iterator.hasNext()) {
                System.out.print(iterator.next() + " ");
            }
        }



    public static void reverseIterator(){

        INtegerCOllection reversecollection = new INtegerCOllection(10);

        for (int i = 14; i > 0; i--) {
            reversecollection.addReverse(i);
        }

        System.out.println(reversecollection);

        INtegerCOllection.decIterator reverseiterator = reversecollection.getreverseIterator();

        while (reverseiterator.reversehasNext()) {
            System.out.print(reverseiterator.reversenext() + " ");
        }
    }
}
