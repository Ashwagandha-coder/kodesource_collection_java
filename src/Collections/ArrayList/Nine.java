package Collections.ArrayList;

import java.util.ArrayList;


public class Nine {


    public static void main(String[] args) {

        new CopyArrayList().TestCopyArrayList();

    }
}

class CopyArrayList {

    public void TestCopyArrayList() {

        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(52);
        arrayList.add(21);
        arrayList.add(33);
        arrayList.add(152);
        arrayList.add(10);


        ArrayList<Integer> arrayList2 = new ArrayList<>(arrayList);

        System.out.println(arrayList2);



    }


}
