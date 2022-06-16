package Collections.TreeSet;

import java.util.TreeSet;

public class Three {


    public static void main(String[] args) {

        new NewTreeSet().copyTreeSet();

    }
}

class NewTreeSet {

    public void copyTreeSet() {

        TreeSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(3);
        treeSet.add(4);
        treeSet.add(5);
        treeSet.add(6);

        TreeSet<Integer> treeSet2 = new TreeSet<>(treeSet);


        System.out.println(treeSet2);



    }



}
