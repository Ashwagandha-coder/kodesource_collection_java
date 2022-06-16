package Collections.TreeSet;

import java.util.TreeSet;

public class One {


    public static void main(String[] args) {

        new TreeSetExample().addTreeSet();

    }
}

class TreeSetExample {

    public void addTreeSet() {

        TreeSet<String> treeSet = new TreeSet();

        treeSet.add("Purple");
        treeSet.add("Green");
        treeSet.add("Red");
        treeSet.add("White");
        treeSet.add("Yellow");


        System.out.println(treeSet);


    }


}
