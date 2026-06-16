//package heap;
//import java.util.*;
//class Pair implements Comparable<Pair>{
//    int diff;
//    int ele;
//    Pair(int diff,int ele){
//        this.diff = diff;
//        this.ele = ele;
//    }
//    public int compareTo(Pair p){
//        if(this.diff == p.diff){
//            return Integer.compare(p.ele,this.ele);
//        }
//
//        return Integer.compare(this.diff,p.diff);
//    }
//}
//public class kclosestelement {
//    public static void main(String[] args) {
//        int[] arr = {1,3,4,10,12};
//        printKClosest(arr,2,4);
//    }
//
//    public static int[] printKClosest(int[] arr, int k, int x) {
//            // code here
//            int[] ans = new int[k];
//            PriorityQueue<Pair> pq = new PriorityQueue<>(Collections.reverseOrder());
//            for (int num : arr){
//                if(num == x) continue;
//                Pair p = new Pair(Math.abs(num-x),num);
//                pq.add(p);
//                if(pq.size() > k){
//                    pq.remove();
//                }
//            }
//            int idx = 0;
//            while(!pq.isEmpty()){
//                Pair p = pq.remove();
//                System.out.println(p.ele + " " + p.diff);
//            }
//            return ans;
//
//    }
//
//
//}
