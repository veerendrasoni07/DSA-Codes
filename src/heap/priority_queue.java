package heap;
import java.util.*;
public class priority_queue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // by default in java its min heap
        pq.add(10);
        pq.add(-5);
        pq.add(50);
        pq.add(-2);
        pq.add(3);
        pq.add(0);
        System.out.println(pq.peek());
        pq.remove();
        System.out.println(pq.peek());
    }
}
