package Collections.PriorityQueue;

import java.util.PriorityQueue;

public class Four {


    public static void main(String[] args) {

        new AddPriorityQueue3().addElemPriorityQueue3();


    }
}

class AddPriorityQueue3 {

    public void addElemPriorityQueue3() {

        PriorityQueue<String> priorityQueue = new PriorityQueue<>();


        priorityQueue.offer("vsfdvf");
        priorityQueue.offer("fdb");
        priorityQueue.offer("weqwd");

        for (String string : priorityQueue)
            System.out.println(string);




    }



}
