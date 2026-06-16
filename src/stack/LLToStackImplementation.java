package stack;


class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}
class MyStack{
    Node head;
    int len;

    int pop() throws Exception{
        if(len==0 || head==null){
            throw new Exception("Stack UnderFlow Error");
        }
        int val = head.data;
        head = head.next;
        len--;
        return val;
    }
    int peek() throws Exception{
        if(len==0){
            throw new Exception("Stack underflow error!");
        }
        return head.data;
    }
    void push(int ele){
        Node temp = new Node(ele);
        if(len==0) head = temp;
        else{
            temp.next = head;
            head = temp;
        }
        len++;
    }

    void display() throws Exception {
        if(head==null){
            throw new Exception("Stack underflow error");
        }

        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }



}

public class LLToStackImplementation {

    public static void main(String[] args) throws Exception{
        MyStack st = new MyStack();



//        st.display();
//        st.pop();
//        st.display();
//        System.out.println(st.peek());
       // System.out.println(st.pop());
        st.display();
    }
}
