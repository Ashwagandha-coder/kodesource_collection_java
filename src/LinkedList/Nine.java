package LinkedList;

import java.util.LinkedList;

public class Nine {


    public static void main(String[] args) {

        new AddIndexElemInLinkedList().addElemIndex();

    }
}

class AddIndexElemInLinkedList {

    public void addElemIndex() {

        LinkedList<Double> linkedList = new LinkedList<>();

        linkedList.add(2.9);
        linkedList.add(3.7);
        linkedList.add(2.2);
        linkedList.add(1.1);
        linkedList.add(4.6);
        linkedList.add(5.3);

        linkedList.add(3,6.55);
        linkedList.add(4,3.33);
        linkedList.add(1,9.99);

        System.out.println(linkedList);



    }


}
