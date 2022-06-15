package Collections.ArrayList;

import java.util.ArrayList;

public class Five {


    public static void main(String[] args) {

        new SetElementArrayList().TestSetElementArraylist();

    }
}

class SetElementArrayList {

    public void TestSetElementArraylist() {

        ArrayList<Double> arrayList = new ArrayList<>(10);

        arrayList.add(50.5);
        arrayList.add(50.6);
        arrayList.add(50.7);
        arrayList.add(50.8);
        arrayList.add(50.9);
        arrayList.add(51.0);

        arrayList.set(2,100.43);

        System.out.println(arrayList);


    }


}
