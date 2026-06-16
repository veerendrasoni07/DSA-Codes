package heap;


import java.util.Arrays;

class Heap extends Exception {
    private int [] arr;
    private int size;
    private int idx;
    Heap(int n){
        idx=1;
        arr = new int [n+1];
        Arrays.fill(arr,Integer.MIN_VALUE);
    }

    void add(int ele) throws Exception{
        if(arr.length < size) {
            throw new Exception("Heap Overflow");
        }
        arr[idx++] = ele;
        size++;
        // rearrangement
        int root = idx-1;
        int parent = root/2;
        while(arr[root] < arr[parent] ) {
            int temp = arr[root];
            arr[root] = arr[parent];
            arr[parent] = temp;
            root = parent;
            parent = root/2;
        }
    }
    int delete() throws  Exception{
        if(size == 0){
            throw new Exception("Heap is empty");
        }
        size--;
        int ele = arr[1];
        arr[1] = arr[idx-1];
        int root = 1;

        int left = arr[2*root];
        int right = arr[2*root + 1];
        if(arr[root] > left  && arr[root] > right ) return ele;
        if(arr[root] > left ){
            arr[2*root] = arr[root];
            arr[root] = left;
        }
        else{
            arr[2*root + 1] = arr[root];
            arr[root] = right;
        }
        return ele;

    }
    void display() throws Exception{
        if(size == 0){
            throw new Exception("Heap is empty");
        }
        for (int i = 1;i<=size;i++) {
            if(arr[i] != Integer.MIN_VALUE){
                System.out.println(arr[i]);
            }
        }
    }


}
public class heap_implementation{
    public static void main(String[] args) throws Exception {
        Heap h = new Heap(7);
        h.add(10);
        h.add(12);
        h.add(5);
        h.add(50);
        h.add(40);
        h.add(1);
        h.display();
        System.out.println("-------------");
        h.delete();
        h.display();
        h.add(0);
        h.display();


    }
}
