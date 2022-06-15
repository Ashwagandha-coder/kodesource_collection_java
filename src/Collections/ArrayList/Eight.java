package Collections.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Eight {


    public static void main(String[] args) {

        new SortArrayList().TestSortArrayList();

    }
}

class SortArrayList {

    public void TestSortArrayList() {

        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(100);
        arrayList.add(206);
        arrayList.add(530);
        arrayList.add(40);
        arrayList.add(510);
        arrayList.add(960);

        Collections.sort(arrayList);

        System.out.println(arrayList);





    }



}
