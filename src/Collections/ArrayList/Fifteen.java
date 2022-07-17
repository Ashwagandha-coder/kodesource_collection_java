package Collections.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Fifteen {


    public static void main(String[] args) {

        new JoinArrayList().joinLists();

    }
}

class JoinArrayList {

    public void joinLists() {

        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();


        list.add(rnd(1, 10));
        list.add(rnd(1, 10));
        list.add(rnd(3, 10));
        list.add(rnd(1, 10));
        list.add(rnd(4, 10));


        list2.add(rnd(2, 20));
        list2.add(rnd(1, 40));
        list2.add(rnd(3, 10));
        list2.add(rnd(9, 90));
        list2.add(rnd(4, 10));

        List<Integer> result = new ArrayList<>();

        result.addAll(list);

        result.addAll(list2);

        System.out.println(result);


    }

    public int rnd(int min, int max) {

        max -= min;

        return (int) (Math.random() * ++max) + min;


    }
}
