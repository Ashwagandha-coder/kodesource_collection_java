package LinkedList;

import java.util.LinkedList;

public class Four {


    public static void main(String[] args) {

        new ItterationLinkedList().itterateLinkedList();

    }
}

class ItterationLinkedList {

    public void itterateLinkedList() {

        LinkedList<Integer> list = new LinkedList<>();


        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);

        for (int i = list.size() - 1; i >= 0; i--) {

            System.out.println(list.get(i));

        }


    }


}