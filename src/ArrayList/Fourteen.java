package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Fourteen {


    public static void main(String[] args) {

        new BubleArrayList().TestBubleArrayList();

    }
}

class BubleArrayList {

    public void TestBubleArrayList() {

        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);

        Collections.swap(arrayList,0,3);

        System.out.println(arrayList);


    }

}
