package Collections.ArrayList;

import java.util.ArrayList;


public class One {


    public static void main(String[] args) {

        new ColorArrayList().TestColorArrayList();

    }
}

class ColorArrayList {

    public void TestColorArrayList() {

        ArrayList<String> arrayList = new ArrayList<>(15);

        arrayList.add("Black");
        arrayList.add("White");
        arrayList.add("Yellow");
        arrayList.add("Green");

        System.out.println(arrayList);


    }


}
