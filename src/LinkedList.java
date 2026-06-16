import java.util.ArrayList;

//class Node{
//    int data;
//    Node next;
//    Node(int data1,Node next1){
//        this.data = data1;
//        this.next = next1;
//    }
//    Node(int data1){
//        this.data = data1;
//        this.next = null;
//    }
//}




class Node {
    int data;
    Node next;
    Node bottom;

    Node(int x) {
        data = x;
        next = null;
        bottom = null;
    }
}

class Solution {
    public Node flatten(Node root) {
        // code here

        if(root==null || root.next==null){
            return root;
        }
        Node temp = root;

        while(temp.next!=null){
            Node front = temp.next;
            while(temp.bottom!=null){
                temp = temp.bottom;
            }
            temp.bottom = front;
            temp.next = null;
            temp = front;
        }
        return root;

    }


}



class LinkedList{
    public static void main(String [] args){

        Node head = new Node(5);
        head.bottom = new Node(14);

        head.next = new Node(10);
        head.next.bottom = new Node(4);

        head.next.next = new Node(12);
        head.next.next.bottom = new Node(20);
        head.next.next.bottom.bottom = new Node(13);

        head.next.next.next = new Node(7);
        head.next.next.next.bottom = new Node(17);


//        int [] arr = {1,2,3,4,5,6};
//        Node head = new Node(arr[0]);
//        Node mover = head;
//        for(int i=1;i<arr.length;i++){
//            Node temp = new Node(arr[i]);
//            mover.next = temp;
//            mover = mover.next;
//        }
//        Node reverse = reverseLL(head);
//        System.out.println(reverse.data);
        Solution sol = new Solution();
        //printOriginalLinkedList(head,0);
        Node newHead = sol.flatten(head);
        printLinkedList(newHead);
        //System.out.println(checkPalindromeOrNot(reverse,head));
        //oddEvenList(head);
        //lengthOfLL(head);

        //System.out.println(searchInALL(head,10));


    }

    public static void printLinkedList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.bottom;
        }
        System.out.println();
    }
    public static void printOriginalLinkedList(Node head, int depth) {
        while (head != null) {
            System.out.print(head.data);

            // If child exists, recursively
            // print it with indentation
            if (head.bottom != null) {
                System.out.print(" -> ");
                printOriginalLinkedList(head.bottom, depth + 1);
            }

            // Add vertical bars
            // for each level in the grid
            if (head.next != null) {
                System.out.println();
                for (int i = 0; i < depth; ++i) {
                    System.out.print("| ");
                }
            }
            head = head.next;
        }
    }

    public static boolean checkPalindromeOrNot(Node rev,Node orig){
        Node temp1 = rev;
        Node temp2 = orig;
        while(temp1!=null && temp2!=null){
            if(temp1.data!=temp2.data){
                return false;
            }

            temp1= temp1.next;
            temp2 = temp2.next;

        }
        return true;
    }
    public static Node reverseLL(Node head){
        Node temp = head;
        Node prev = null;
        while(temp!=null){
            Node front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return head;
    }
    public static void oddEvenList(Node head) {
        ArrayList<Integer> nodeArrayList = new ArrayList<>();
        Node temp = head;

        while (temp!=null && temp.next!=null){
            nodeArrayList.add(temp.data);
            temp = temp.next.next;
        }
        if (temp!=null) nodeArrayList.add(temp.data);
        temp = head.next;
        while(temp!=null && temp.next!=null){
            nodeArrayList.add(temp.data);
            temp = temp.next.next;
        }
        if(temp!=null){
            nodeArrayList.add(temp.data);
        }
        for (int node : nodeArrayList) {
            System.out.printf(" node :%d\n",node);
        }
        int i =0;
        temp = head;
        while(i<nodeArrayList.size() && temp!=null){
            temp.data = nodeArrayList.get(i);
            i++;
            temp = temp.next;
        }



    }






//    static void lengthOfLL(Node head){
//        Node temp = head;
//        int cnt = 0;
//        while (temp!=null){
//            System.out.println(temp.data);
//            temp = temp.next;
//            cnt++;
//        }
//        System.out.printf("The Length Of Linked List : %d\n",cnt);
//    }
//    static boolean searchInALL(Node head,int val){
//        Node temp = head;
//        while(temp!=null){
//            if(temp.data==val){
//                return true;
//            }
//            else{
//                temp=temp.next;
//            }
//        }
//        return false;
//    }

}



// doubly linked list
class DoublyLinkedList{
    public static void main(String[] args) {
        int [] arr = {1,1,1,12,2,2,3,5};
        DLL head = convertArrToDLL(arr);
        //printDLL(head);
        //deleteHeadNode(head);
        //deleteTailNode(head);
        //deleteKthNode(head,2);
        //deleteNode(head,head.next);
        //insertTheNodeAtHead(head,10);
        //insertTheNodeBeforeTail(head,10);
        //insertTheNodeBeforeKth(head,10,4);
        //insertBeforeNode(head,head.next.next,10);
        //printDLL(deleteAllOccurOfX(head,2));
        DLL newHead = removeDuplicates(head);
        printDLL(newHead);
    }
    public static DLL convertArrToDLL(int [] arr){
        int n = arr.length;
        DLL head = new DLL(arr[0]);
        DLL prev = head;
        for(int i=1;i<n;i++){
            DLL temp = new DLL(arr[i],prev,null);
            prev.next = temp;
            prev=temp;
        }
        return head;

    }
    public static void printDLL(DLL head){
       while(head!=null){

           System.out.printf("Data :%d ",head.data);
           head = head.next;
       }
    }

    public static void deleteHeadNode(DLL head){
       head = head.next;
       head.prev.next = null;
       head.prev = null;
       printDLL(head);
    }
    public static void deleteTailNode(DLL head){
        DLL temp = head;

        while(temp.next!=null){
            temp = temp.next;
        }
        temp.prev.next = null;
        temp.prev = null;
        printDLL(head);
    }
    public  static int lengthOfDLL (DLL head){
        int cnt = 0;
        DLL temp = head;
        while(temp.next!=null){
            temp = temp.next;
            cnt++;
        }
        return cnt;
    }
    public static void deleteKthNode(DLL head,int k){

        if(head.next == null){
            System.out.println(head);
            return;
        }
        DLL temp = head;
        int length = lengthOfDLL(head);
        int cnt = 1;
        while(cnt !=k && temp.next!=null){
            temp = temp.next;

            cnt++;
        }

        DLL prev = temp.prev;
        DLL front = temp.next;
        if(prev == null){
            deleteHeadNode(head);
            return;
        }
        else if(front == null){
            deleteTailNode(head);
            return;
        }
        else {
            prev.next = front;
            front.prev = prev;
            temp.prev= null;
            temp.next = null;
        }
        printDLL(head);
    }


    public static void deleteNode(DLL head,DLL temp){
        if(temp.next == null){
            deleteTailNode(temp);
            return;
        }
        if (temp.prev == null){
            deleteHeadNode(temp);
            return;
        }
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
        temp.next = null;
        temp.prev = null;
        printDLL(head);

    }

    public static void insertTheNodeAtHead(DLL head,int val){
        DLL newNode = new DLL(val);
        head.prev = newNode;
        newNode.next = head;
        newNode.prev = null;
        head = newNode;

        printDLL(head);
    }
    public static void insertTheNodeBeforeTail(DLL head,int val){
        DLL newNode = new DLL(val);
        DLL temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        DLL prev = temp.prev;
        prev.next = newNode;
        newNode.prev = prev;
        newNode.next = temp;
        temp.prev = newNode;
        printDLL(head);
    }

    public static void insertTheNodeBeforeKth(DLL head,int val,int k){

        DLL newNode = new DLL(val);
        DLL temp = head;
        int cnt = 1;
        while(cnt !=k && temp.next!=null){
            cnt+=1;
            temp = temp.next;
        }
        DLL prev = temp.prev;
        if(prev==null){
            insertTheNodeAtHead(head,val);
            return;
        }
        prev.next = newNode;
        newNode.prev = prev;
        newNode.next = temp;
        temp.prev = newNode;
        printDLL(head);
    }
    public static void insertBeforeNode(DLL head,DLL n,int val){
        DLL newNode = new DLL(val);
        n.prev.next = newNode;
        newNode.prev = n.prev;
        newNode.next = n;
        n.prev = newNode;
        printDLL(head);
    }
    static DLL deleteAllOccurOfX(DLL head, int x) {
        // Write your code here
        DLL temp = head;
        DLL prev = temp.prev;
        while(temp!=null){
            DLL front =  temp.next;
            if(temp.data==x){
                if(front!=null){
                    front.prev = prev;
                }
                if(prev!=null){
                    prev.next = front;
                }

            }
            if(temp.data!=x)prev = temp;
            temp = front;

        }
        DLL back = prev;
        while(back.prev!=null){
            back = back.prev;
        }
        head = back;
        return  head;
    }


    public static DLL removeDuplicates(DLL head) {
        // Code Here.
        if(head==null || head.next==null){
            return head;
        }
        DLL temp = head;
        while(temp.next != null){
           if(temp.data == temp.next.data){
               temp.next = temp.next.next;
               if(temp.next!=null){
                   temp.next.prev = temp;
               }
           }
           else temp = temp.next;
        }
        return head;
    }



}

class DLL{
    int data;
    DLL prev;
    DLL next;
    DLL(int data1){
        this.data = data1;
        this.prev = null;
        this.next = null;
    }
    DLL(int data1,DLL prev,DLL next){
        this.data = data1;
        this.prev = prev;
        this.next = next;
    }
}