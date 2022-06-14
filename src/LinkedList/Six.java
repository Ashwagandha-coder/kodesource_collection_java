package LinkedList;

import java.util.LinkedList;

public class Six {


    public static void main(String[] args) {

        new AddElemInLinkedList().addElement();

    }
}

class AddElemInLinkedList {

    private LinkedList<Integer> list;

    public void addElement() {

        list = new LinkedList<>();

        list.add(279);

        System.out.println(list);



    }


}
