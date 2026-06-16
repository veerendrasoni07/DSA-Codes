package queues;

import java.util.LinkedList;
import java.util.Queue;

public class basic_queues {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);queue.add(70);queue.add(20);
//        System.out.println(queue +" "+queue.size());
//        System.out.println(queue + " "+ queue.peek());
//        System.out.println(queue+" "+ queue.remove());
//        System.out.println(queue);
        for(int i=0;i<queue.size()-1;i++){
            queue.add(queue.remove());
        }
        System.out.println(queue);
    }

}
