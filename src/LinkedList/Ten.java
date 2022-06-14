package LinkedList;

import java.util.LinkedList;

public class Ten {


    public static void main(String[] args) {

        new GetElemLinkedList().getElem();

    }
}

class GetElemLinkedList {

    public void getElem() {

        LinkedList<Integer> list = new LinkedList<>();

        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        list.add(60);

        System.out.println(list.get(0) + " " + list.get(list.size() - 1));


    }


}
