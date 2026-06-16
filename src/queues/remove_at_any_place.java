package queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class remove_at_any_place {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        System.out.printf("Enter the ith index between (1 to %d) :",q.size());
        int n = sc.nextInt();
        for(int i =0;i<n;i++){
            q.add(q.remove());
        }
        System.out.printf("The element at %d is %d :",n,q.peek());
        for(int i=0;i<q.size()-n;i++){
            q.add(q.remove());
        }
        System.out.println(q);
    }
}
