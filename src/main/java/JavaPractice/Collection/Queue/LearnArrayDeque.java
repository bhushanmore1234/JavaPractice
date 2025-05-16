package JavaPractice.Collection.Queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class LearnArrayDeque {
    public static void main(String[] args) {
        /*
        *  Note : Array deque work from both side, you can add or remove element from front as well as from back side
        *  Offer function coming from queue and this will add element in last
        *
        *  offerFirst function coming from aarayDeque class this will add element at first
        *  offerLast function coming from aarayDeque class this will add element at last
        *
        * pollFirst function coming from aarayDeque class this will remove element at first
        * pollLast function coming from aarayDeque class this will remove element at last
        *
        * peekFirst function coming from aarayDeque class this will check next element at first
        * peekLast function coming from aarayDeque class this will check next element at last
        *
        *
        * */

        ArrayDeque<Integer> adq = new ArrayDeque<>();
        adq.offer(2);
        adq.offer(1);
        adq.offer(5);
        adq.offer(4);
        adq.offer(3);

        System.out.println("Elements in array deque : "+adq);

        adq.offerFirst(0);
        System.out.println("OfferFirst method will add element at first position : "+adq);

        adq.offerLast(6);
        System.out.println("OfferLast method will add element at Last position : "+adq);

        adq.pollFirst();
        System.out.println("PollFirst method will remove element from first position : "+adq);

        adq.pollLast();
        System.out.println("PollLast method will remove element from Last position : "+adq);


        System.out.println("PeekFirst method will remove element from first position : "+adq.peekFirst());
        System.out.println("PeekLast method will remove element from Last position : "+adq.peekLast());





    }
}
