package LinkedList;

import java.util.LinkedList;

public class Two {


    public static void main(String[] args) {

        new ForLinkedList().ForLinkedListElement();

    }
}

class ForLinkedList {

    public void ForLinkedListElement() {

        LinkedList<String> linkedList = new LinkedList<>();


        linkedList.add("Spring");
        linkedList.add("Summer");
        linkedList.add("Winter");
        linkedList.add("Autmn");

        for (String string : linkedList)
            System.out.println(string);


    }


}
