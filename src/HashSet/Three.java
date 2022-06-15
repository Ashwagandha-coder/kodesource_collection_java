package HashSet;

import java.util.HashSet;

public class Three {


    public static void main(String[] args) {

        new SizeHashSet().sizeElemHashSet();

    }
}

class SizeHashSet {

    public void sizeElemHashSet() {

        HashSet<Integer> hashSet = new HashSet<>();


        hashSet.add(20);
        hashSet.add(30);
        hashSet.add(40);
        hashSet.add(50);
        hashSet.add(60);

        System.out.println(hashSet.size());



    }


}
