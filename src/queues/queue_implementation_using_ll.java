package queues;

import java.util.LinkedList;

public class queue_implementation_using_ll {
    static class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class Queue{
        Node head;
        Node tail;
        int size;

        void add(int val){
            Node newEle = new Node(val);
            size++;
            if(head==null && tail==null){
                head = newEle;
                tail = newEle;
                return;
            }
            tail.next=newEle;
            tail = tail.next;
        }
        int remove() throws  Exception{
            if(head==null){
                throw new Exception("Queue is not having any element");
            }
            int val = head.data;
            size--;
            head = head.next;
            return val;
        }
        int peek() throws Exception{
            if(head==null){
                throw new Exception("Queue is not having any element");
            }
            return head.data;
        }
        int getSize(){
            return size;
        }
        void display(){
            Node temp = head;
            while(temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }
        }

    }
    public static void main(String[] args) throws Exception {
        Queue q = new Queue();



        System.out.println(q.getSize());
    }
}
