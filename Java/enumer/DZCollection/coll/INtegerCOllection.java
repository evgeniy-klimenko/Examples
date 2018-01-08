package Collections.enumer.DZCollection;

import java.util.Arrays;

public class INtegerCOllection {

        private static int defaultCapacity = 15;

        private int size = 0;

        private Integer[] array;

        public INtegerCOllection() {
            array = new Integer[defaultCapacity];
        }

        public INtegerCOllection(int capacity) {
            array = new Integer[capacity];
        }

        public void add(Integer value) {
            array[size++] = value;
            if (size == array.length) {
                increaseCapacity();
            }
        }
        public void addReverse(Integer value){ // reverse
        array[size++] = value;
            if (size == array.length){
               reverseCapacity();
            }
    }

    private void reverseCapacity() {
        Integer [] temp = array;
        array = new  Integer[temp.length * 3 / 2];
        System.arraycopy(temp, 0, array, 0, temp.length);

    }

    private void increaseCapacity() {
            Integer[] temp = array;
            array = new Integer[temp.length * 3 / 2];
            System.arraycopy(temp, 0, array, 0, temp.length);
        }



        @Override
        public String toString() {
            return Arrays.toString(array);
        }

        class Iterator {

            private int index = 0;

            public boolean hasNext() {

                return index < array.length;
            }

            public Integer next() {
                return array[index++];
            }
        }

        public Iterator getIterator() {
            return new Iterator();
        }





    class decIterator {
        private int index = array.length;

        public boolean reversehasNext() {

            return index > array.length;
        }

        public Integer reversenext() {
            return array[index--];
        }
    }

    public decIterator getreverseIterator() {
        return new decIterator();
    }

}


