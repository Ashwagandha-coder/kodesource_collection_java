package Collections.Queue;

import java.util.LinkedList;

public class Task {


    public static void main(String[] args) {

        new LinkedListQueue().addElemLinkedList();

    }
}

class LinkedListQueue {

    public void addElemLinkedList() {

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.offer(1);
        linkedList.offer(2);
        linkedList.offer(3);
        linkedList.offer(79);
        linkedList.offer(33);
        linkedList.offer(21);

        System.out.println(linkedList.peek());

        linkedList.offer(17);

        System.out.println(linkedList.poll());
        System.out.println(linkedList.peek());

        System.out.println(linkedList.remove());


    }

}
