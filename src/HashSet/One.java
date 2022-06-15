package HashSet;

import java.util.HashSet;

public class One {


    public static void main(String[] args) {

        new AddHashSet().addElemHashSet();

    }
}

class AddHashSet {

    public void addElemHashSet() {

        HashSet<Integer> hashSet = new HashSet<>();

        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(4);
        hashSet.add(5);


        System.out.println(hashSet);



    }


}
