package Collections.ArrayList;

import java.util.ArrayList;

public class Seven {


    public static void main(String[] args) {

        new ContainsElementArrayList().TestContainsElementArrayList();

    }
}

class ContainsElementArrayList {

    public void TestContainsElementArrayList() {

        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);
        arrayList.add(8);

        System.out.println(arrayList.contains(5));



    }



}
