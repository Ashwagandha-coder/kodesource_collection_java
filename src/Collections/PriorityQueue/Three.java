package Collections.PriorityQueue;

import java.util.PriorityQueue;

public class Three {


    public static void main(String[] args) {

        new CopyPriorityQueue().copyElemPriorityQueue();

    }
}

class CopyPriorityQueue {

    public void copyElemPriorityQueue() {

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        priorityQueue.offer(13);
        priorityQueue.offer(22);
        priorityQueue.offer(33);
        priorityQueue.offer(11);

        PriorityQueue<Integer> priorityQueue2 = new PriorityQueue<>(priorityQueue);

        System.out.println(priorityQueue2);


    }


}

// при выводе на консоль не сохранятся приоритет
