package Collections.HashSet;

import java.util.HashSet;

public class Six {


    public static void main(String[] args) {

        new CloneHashSet().cloneSet();

    }
}

class CloneHashSet {

    public void cloneSet() {

        HashSet<Integer> hashSet = new HashSet<>();

        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(67);
        hashSet.add(9);
        hashSet.add(1);
        hashSet.add(86);
        hashSet.add(55);




        HashSet<Integer> hashSet2 = new HashSet<>(hashSet);

        System.out.println(hashSet2);



    }


}