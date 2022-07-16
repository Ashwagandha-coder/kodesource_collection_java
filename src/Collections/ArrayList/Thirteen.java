package Collections.ArrayList;

import java.util.ArrayList;

public class Thirteen {


    public static void main(String[] args) {

        new CompareArrayLists().print();

    }
}

class CompareArrayLists {

    public void print() {

        ArrayList<Integer> arrayList = new ArrayList<>();

        ArrayList<Integer> arrayList2 = new ArrayList<>();

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(5);
        arrayList.add(45);
        arrayList.add(12);

        arrayList2.add(1);
        arrayList2.add(2);
        arrayList2.add(5);
        arrayList2.add(12);

        ArrayList<String> result = new ArrayList<>();

        for (Integer i : arrayList) {

            if (arrayList2.contains(i))
                result.add("YES");
            else
                result.add("NO");

        }

        System.out.println(result);



    }



}
