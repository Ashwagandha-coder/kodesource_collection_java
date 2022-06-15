package Collections.HashSet;

import java.util.HashSet;

public class Four {


    public static void main(String[] args) {

        new ClearHashSet().clearElemHashSet();

    }
}

class ClearHashSet {

    public void clearElemHashSet() {

        HashSet<Integer> hashSet = new HashSet<>();


        hashSet.add(222);
        hashSet.add(333);
        hashSet.add(444);
        hashSet.add(555);

        hashSet.clear();

        System.out.println(hashSet);



    }


}
