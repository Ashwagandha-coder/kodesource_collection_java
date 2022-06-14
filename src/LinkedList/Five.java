package LinkedList;

import java.util.LinkedList;

public class Five {


    public static void main(String[] args) {

        new AddLinkedListElem().addElem();

    }
}

class AddLinkedListElem {

    public void addElem() {

        LinkedList<String> list = new LinkedList<>();

        list.add("Masha");
        list.add("Natasha");
        list.add("Dasha");
        list.add("Olya");
        list.add("Nika");
        list.add("Lena");

        list.add(3,"Mike");

        System.out.println(list);


    }

}
