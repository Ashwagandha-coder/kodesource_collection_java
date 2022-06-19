package Collections.PriorityQueue;

import java.util.PriorityQueue;

public class One {

    public static void main(String[] args) {

        new AddPriorityQueue().addElemPriorityQueue();

    }


}

class AddPriorityQueue {

    public void addElemPriorityQueue() {

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        priorityQueue.add(2);
        priorityQueue.add(30);
        priorityQueue.add(43);
        priorityQueue.add(152);
        priorityQueue.add(9);
        priorityQueue.add(1);

        System.out.println(priorityQueue);



    }



}