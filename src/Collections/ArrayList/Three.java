package Collections.ArrayList;

import java.util.ArrayList;

public class Three {


    public static void main(String[] args) {

        new AddArrayList().TestAddArrayList();

    }
}

class AddArrayList {

    public void TestAddArrayList() {

        ArrayList<Integer> arrayList = new ArrayList<>(10);

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);
        arrayList.add(8);


        arrayList.add(0,100);

        System.out.println(arrayList);


    }


}