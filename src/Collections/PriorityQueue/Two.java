package Collections.PriorityQueue;

import java.util.PriorityQueue;

public class Two {


    public static void main(String[] args) {

        new AddPriorityQueue2().addElemPriorityQueue2();

    }
}

class AddPriorityQueue2 {

    public void addElemPriorityQueue2() {

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();


        priorityQueue.offer(2);
        priorityQueue.offer(3);
        priorityQueue.offer(9);
        priorityQueue.offer(1);
        priorityQueue.offer(15);

        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.peek());

        System.out.println("------");

        for (Integer integer : priorityQueue)
            System.out.println(integer);


    }


}

// peek poll remove offer size


