package Collections.LinkedList;

import java.util.LinkedList;

public class One {


    public static void main(String[] args) {

        new AddLinkedList().AddLinkedListElement();

    }
}

class AddLinkedList {

    public void AddLinkedListElement() {

        LinkedList<Integer> list = new LinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println(list);

    }


}
