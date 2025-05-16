package JavaPractice.Collection.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class LearnLinkedListQueue {
    public static void main(String[] args) {

        /*
           MAJORLY WE USE OFFER, POP AND PEEK METHODS FOR queue

           FIFO - First In First Out
           OFFER / ADD - We use this to add element in the list
           PEEK / ELEMENT - We use this to see which element is ready to come out next
           POLL / REMOVE - We use this to remove first element from the queue
           NOTE - If we are using add, element or remove method it will throw exception

         */

        Queue<Integer>  queue = new LinkedList<>();
        queue.offer(12);
        queue.offer(13);
        queue.offer(14);
        queue.offer(15);
        queue.offer(16);

        System.out.println("Elements in queue :"+ queue);
        System.out.println("Element remove from front : "+queue.poll());

        System.out.println("Elements in queue :"+ queue);
        System.out.println("Elements in queue which is ready to remove :"+queue.peek());

        System.out.println("Elements in queue :"+ queue);

    }
}
