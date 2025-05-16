package JavaPractice.Collection.Queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriorityQueue
{
    public static void main(String[] args) {

        /*
        Note : This work same ass queue but in this queue will arrange in particular pattern

        Default patter in Min heap
        You can specify order if you want just like Comparator.reverseOrder()
        *
        * */


        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.offer(14);
        pq.offer(15);
        pq.offer(16);
        pq.offer(12);
        pq.offer(13);

        System.out.println("Priority Queue : "+pq);
        pq.poll();
        System.out.println("Priority Queue : "+pq);
        System.out.println("Priority Queue next element : "+pq.peek());




    }
}
