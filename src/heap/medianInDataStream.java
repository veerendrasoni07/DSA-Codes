package heap;

import java.util.Collections;
import java.util.PriorityQueue;

class MedianFinder {
    PriorityQueue<Integer> minHeap ;
    PriorityQueue<Integer> maxHeap ;
    public MedianFinder() {
        minHeap = new PriorityQueue<>();
        maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    }

    public void addNum(int num) {
        if(minHeap.isEmpty()){
            minHeap.add(num);
        }
        else{
            if(minHeap.peek() < num ){
                maxHeap.add(num);
            }
            if(num < maxHeap.peek()){
                minHeap.add(num);
            }
        }
        if(minHeap.size() == maxHeap.size() + 2){
            maxHeap.add(minHeap.remove());
        }
        if(maxHeap.size() == minHeap.size() + 2){
            minHeap.add(maxHeap.remove());
        }
    }

    public double findMedian() {
        if(minHeap.size() == maxHeap.size()){
            return (minHeap.peek()+maxHeap.peek())/2.0;
        }
        else{
            if(minHeap.size() > maxHeap.size()){
                return minHeap.peek();
            }
            else{
                return maxHeap.peek();
            }
        }

    }
}
public class medianInDataStream {
    public static void main(String[] args) {
    }
}
