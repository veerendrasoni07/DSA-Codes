package graph;
import java.util.*;
public class isCycleInDirectedGraph {
    public boolean isCyclic(int V, int[][] edges) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<=V;i++){
            adj.add(new ArrayList<>());
        }
        int [] in = new int [V];
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<edges.length;i++){
            int u = edges[i][0];
            int v = edges[i][1];
            adj.get(u).add(v);
            in[v]++;
        }
        for(int i=0;i<V;i++){
            if(in[i]==0){
                q.add(i);
            }
        }
        while(!q.isEmpty()){
            int top = q.remove();
            ans.add(top);
            for(int ele : adj.get(top)){
                if(in[ele] != 0){
                    in[ele]--;
                    if(in[ele]==0){
                        q.add(ele);
                    }
                }
            }

        }
        return ans.size()!=V;
    }
}
