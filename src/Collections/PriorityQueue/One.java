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
        priorityQueue.add(3);
        priorityQueue.add(4);
        priorityQueue.add(5);

        System.out.println(priorityQueue);



    }



}