package Collections.HashSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

public class Seven {


    public static void main(String[] args) {

        new MapHashSet().map();

    }
}

class MapHashSet {

    public void map() {


        HashSet<String> hashSet = new HashSet<>();


        hashSet.add("Put");
        hashSet.add("Putu");
        hashSet.add("Pute");
        hashSet.add("Putq");
        hashSet.add("Puti");

        Object[] array;

        array = hashSet.stream().toArray();

        System.out.println(Arrays.toString(array));





    }



}
