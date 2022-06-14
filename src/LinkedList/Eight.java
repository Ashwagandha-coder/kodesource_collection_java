package LinkedList;

import java.util.LinkedList;

public class Eight {


    public static void main(String[] args) {

        new EndAddElemInLinkedList().addElemEnd();

    }
}


class EndAddElemInLinkedList {

    public void addElemEnd() {

        LinkedList<Integer> list = new LinkedList<>();


        list.add(15);
        list.add(17);
        list.add(159);
        list.add(23);
        list.add(659);
        list.add(122);
        list.add(346);
        list.add(999);

        list.add(555);

        System.out.println(list);



    }


}