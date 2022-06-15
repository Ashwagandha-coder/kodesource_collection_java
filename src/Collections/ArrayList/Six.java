package Collections.ArrayList;

import java.util.ArrayList;

public class Six {


    public static void main(String[] args) {

        new RemoveElementArrayList().TestRemoveElementArrayList();

    }
}

class RemoveElementArrayList {

    public void TestRemoveElementArrayList() {

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Fork");
        arrayList.add("Spoon");
        arrayList.add("Knife");
        arrayList.add("Plate");
        arrayList.add("Ice");

        arrayList.remove(2);

        System.out.println(arrayList);


    }


}
