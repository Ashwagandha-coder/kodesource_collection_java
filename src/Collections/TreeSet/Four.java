package Collections.TreeSet;

import java.util.TreeSet;

public class Four {


    public static void main(String[] args) {

        new ViceVersaTreeSet().ForViceVersaTreeSet();

    }
}

class ViceVersaTreeSet {

    public void ForViceVersaTreeSet() {

        TreeSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(3);
        treeSet.add(4);
        treeSet.add(5);
        treeSet.add(6);


        System.out.println(treeSet.descendingSet());



    }



}
