package Collections.ArrayList;

import java.util.ArrayList;

public class Two {


    public static void main(String[] args) {

        new ItterativeArrayList().TestItterativeArrayList();

    }
}

class ItterativeArrayList {

    public void TestItterativeArrayList() {

        ArrayList<String> arrayList = new ArrayList<>(10);

        arrayList.add("Apple");
        arrayList.add("Orange");
        arrayList.add("Banana");
        arrayList.add("Pear");
        arrayList.add("Appricot");
        arrayList.add("Water Melon");

        for (String str : arrayList) {

            System.out.println(str);

        }




    }


}
