package Collections.ArrayList;

import java.util.ArrayList;

public class Eleven {


    public static void main(String[] args) {

        new GetArrayList().TestGetArrayList();

    }
}

class GetArrayList {

    public void TestGetArrayList() {

        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        System.out.println(arrayList.get(2));



    }


}
