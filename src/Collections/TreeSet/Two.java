package Collections.TreeSet;

import java.util.TreeSet;

public class Two {


    public static void main(String[] args) {

        new ForEachTreeSet().forEachElemTreeSet();

    }
}

class ForEachTreeSet {

    public void forEachElemTreeSet() {

        TreeSet<String> treeSet = new TreeSet<>();


        treeSet.add("Join");
        treeSet.add("Return");
        treeSet.add("For");
        treeSet.add("Interface");
        treeSet.add("Class");

        treeSet.forEach(e -> System.out.println(e));



    }


}
