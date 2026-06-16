package heap;
import java.util.*;

class Pair implements Comparable<Pair> {
    int freq;
    int ele;
    Pair(int freq, int ele) {
        this.freq = freq;
        this.ele = ele;
    }
    public int compareTo(Pair p) {
        if (this.freq == p.freq) {
            return Integer.compare(this.ele,p.ele);
        }

        return Integer.compare(this.freq, p.freq);
    }
}
public class topkfrequentelement {
    public static void main(String[] args) {
        int[] arr = {7,10,11,5,2,5,5,7,11,8,9};
        topKFreq(arr,4);
    }
    public static ArrayList<Integer> topKFreq(int[] arr, int k) {
        // Code here
        HashMap<Integer,Integer> mp = new HashMap<>();
        PriorityQueue<Pair> pq = new PriorityQueue<>();

        for(int n : arr){
            mp.put(n,mp.getOrDefault(n,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : mp.entrySet()){
            Pair p = new Pair(entry.getValue(),entry.getKey());
            pq.add(p);
//            if(pq.size()>k){
//                pq.remove();
//            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        while(!pq.isEmpty()){
            Pair p = pq.remove();
            System.out.println(p.ele + "->" + p.freq);
//            ans.add(p.ele);
        }
        // reverse(ans);
        return ans;
    }
    public static void reverse(ArrayList<Integer> ans) {
        int n = ans.size();
        for (int i = 0; i<n/2; i++) {
            int temp = ans.get(i);
            ans.set(i,ans.get(n - i-1));
            ans.set(n - i-1,temp);
        }
    }
}
