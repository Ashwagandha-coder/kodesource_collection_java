package ArrayList;

import java.util.ArrayList;

public class Twenty {


    public static void main(String[] args) {

        new SubListArrayList().TestSubListArrayList();

    }
}

class SubListArrayList {

    public void TestSubListArrayList() {

        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(300);
        arrayList.add(400);
        arrayList.add(500);
        arrayList.add(600);

        ArrayList<Integer> subList = new ArrayList<>(arrayList.subList(0,3));

        System.out.println(subList);



    }


}
