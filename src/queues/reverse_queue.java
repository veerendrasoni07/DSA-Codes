package queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class reverse_queue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        int size = q.size();
        System.out.println(q);
        Stack<Integer> st = new Stack<>();
        System.out.println(q.size());
        for(int i=0;i<size;i++){
            st.push(q.remove());
        }
        System.out.println(st);
        for(int i=0;i<size;i++){
            q.add(st.pop());
        }
        System.out.println(q);
    }
}
