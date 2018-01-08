package IODZ;

import static com.sun.corba.se.spi.activation.IIOP_CLEAR_TEXT.value;

public class MyStringQueue {

    private Node head = new Node();
    private Node tail = head;

    private static class Node {

        String value;
        Node next;

        public Node(String value, Node next) {
            this.value = value;
            this.next = next;
        }

        public Node() {

        }

        public String getValue() {
            return value;
        }

        public Node getNext() {
            return next;
        }
    }

    public void add(String value) {

        tail = new Node(value, tail);/// dostaet s nachala poetomu null

    }

    public boolean hasNext() {
        return tail.getNext() != null;
    }

    public String get() {

        String value;

        if (hasNext()) {
            value = tail.getNext().getValue();
            tail = tail.getNext().getNext();
        } else  {
            return null;
        }
            return value;
    }

}