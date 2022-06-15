package Collections.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Ten {


    public static void main(String[] args) {

        new RandomArrayList().TestRandomArrayList();

    }
}

class RandomArrayList {

    public void TestRandomArrayList() {

        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);
        arrayList.add(8);
        arrayList.add(9);

        Collections.shuffle(arrayList);

        System.out.println(arrayList);


    }


}
