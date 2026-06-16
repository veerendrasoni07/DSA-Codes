package queues;


import java.util.Arrays;

class Queue{
    int [] arr;
    int f;
    int r;
    int size;
    Queue(int n){
        arr = new int[n];
    }

    void add(int val) throws Exception{
        if(size==arr.length){
            throw new Exception("Queue is full!");
        }
        arr[r] = val;
        r++;
        if(r==arr.length){
            r=0;
        }
        size++;
    }
    int remove() throws Exception{
        if(size==0){
            throw new Exception("Queue is empty!");
        }
        int ele = arr[f];
        f++;
        if(f==arr.length){
            f=0;
        }
        size--;
        return ele;
    }
    int peek() throws  Exception{
        if(size==0){
            throw new Exception("Queue is empty!");
        }
        return arr[f];
    }
    void display(){
       if(f>=r){

           for(int i=f;i<arr.length;i++){
               System.out.println(arr[i]);
           }
           for(int i=0;i<r;i++){
               System.out.println(arr[i]);
           }
       }else{

           for(int i=f;i<r;i++){
               System.out.println(arr[i]);
           }
       }
    }


}
public class queue_implementation_using_array {
    public static void main(String[] args) throws  Exception{
        Queue queue = new Queue(4);
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.remove();
        queue.add(5);
        queue.display();
        System.out.println(Arrays.toString(queue.arr));
    }
}
