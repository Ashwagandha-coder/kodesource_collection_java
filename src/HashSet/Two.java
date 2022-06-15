package HashSet;

import java.util.HashSet;

public class Two {


    public static void main(String[] args) {

        new ForHashSet().forElemHashSet();

    }
}

class ForHashSet {

    public void forElemHashSet() {

        HashSet<String> hashSet = new HashSet<>();


        hashSet.add("Spring");
        hashSet.add("Winter");
        hashSet.add("Autmn");
        hashSet.add("Summer");

        for (String str : hashSet) {

            System.out.println(str);

        }



    }



}
