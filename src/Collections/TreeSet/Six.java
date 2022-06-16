package Collections.TreeSet;

import java.util.TreeSet;

public class Six {


    public static void main(String[] args) {

        new CloneTreeSet().cloneElemTreeSet();

    }
}

class CloneTreeSet {

    public void cloneElemTreeSet() {

        TreeSet<Double> treeSet = new TreeSet<>();


        treeSet.add(1.0);
        treeSet.add(1.1);
        treeSet.add(0.5);
        treeSet.add(5.7);
        treeSet.add(1.2);
        treeSet.add(2.9);


        TreeSet<Double> treeSet2;

        treeSet2 = (TreeSet<Double>) treeSet.clone();

        System.out.println(treeSet2);


    }



}
