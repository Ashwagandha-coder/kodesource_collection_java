package LinkedList;

import java.util.LinkedList;

public class Three {


    public static void main(String[] args) {

        new ForGetLinkedList().ForGetLinkedListElement();

    }
}

class ForGetLinkedList {

    public void ForGetLinkedListElement() {

        LinkedList<Double> linkedList = new LinkedList<>();


        linkedList.add(2.0);
        linkedList.add(3.1);
        linkedList.add(4.2);
        linkedList.add(5.3);
        linkedList.add(6.4);

        linkedList.forEach(a -> System.out.println(a));


    }


}
