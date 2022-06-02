package ArrayList;

import java.util.ArrayList;

public class Four {


    public static void main(String[] args) {

        new GetElementArrayList().TestGetElementArrayList();

    }
}

class GetElementArrayList {

    public void TestGetElementArrayList() {

        ArrayList<Integer> arrayList = new ArrayList<>(10);

        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(300);
        arrayList.add(400);
        arrayList.add(500);
        arrayList.add(600);

        System.out.println(arrayList.get(2));


    }

}