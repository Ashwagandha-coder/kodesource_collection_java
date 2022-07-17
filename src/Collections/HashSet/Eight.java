package Collections.HashSet;

import java.util.HashSet;
import java.util.TreeSet;

public class Eight {


    public static void main(String[] args) {

        new MapSet().inTreeSet();

    }
}

class MapSet {

    public void inTreeSet() {

        HashSet<Integer> hashSet = new HashSet<>();

        hashSet.add(22);
        hashSet.add(32);
        hashSet.add(52);
        hashSet.add(29);
        hashSet.add(11);
        hashSet.add(37);

        TreeSet<Integer> treeSet = new TreeSet<>(hashSet);

        System.out.println(treeSet);



    }

}
