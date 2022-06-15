package Collections.HashSet;

import java.util.HashSet;

public class Five {


    public static void main(String[] args) {

        new EmptyHashSet().emptyElemHashSet();

    }
}

class EmptyHashSet {

    public void emptyElemHashSet() {

        HashSet<String> hashSet = new HashSet<>();


        hashSet.add("fbdfb");
        hashSet.add("rwefvxc");
        hashSet.add("sfeewf");
        hashSet.add("wqdfdvcvv");

        System.out.println(hashSet.isEmpty());



    }


}
