package Collections.LinkedList;

import java.util.LinkedList;

public class Seven {


    public static void main(String[] args) {

        new BeginAddElemInLinkedList().addBeginElem();

    }
}

class BeginAddElemInLinkedList {

    public void addBeginElem() {

        LinkedList<String> list = new LinkedList<>();


        list.add("Popa");
        list.add("Dopa");
        list.add("Nopa");
        list.add("Jopa");
        list.add("Goba");

        list.add(0,"Roja");

        System.out.println(list);


    }


}