package Collections.TreeSet;

import java.util.TreeSet;

public class Five {


    public static void main(String[] args) {

        new GetTreeSet().getElemTreeSet();

    }
}

class GetTreeSet {

    public void getElemTreeSet() {

        TreeSet<Integer> treeSet = new TreeSet<>();


        treeSet.add(1);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(17);
        treeSet.add(16);
        treeSet.add(15);

        System.out.println(treeSet.first());

        System.out.println(treeSet.last());



    }


}
