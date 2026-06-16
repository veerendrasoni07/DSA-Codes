package trees;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Node {
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val = val;
    }
}
class Pair{
    Node root;
    int level;
    Pair(Node root,int level){
        this.root = root;
        this.level = level;
    }
}

public class tree_implementation {
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(5);
        Node c = new Node(3);
        Node d = new Node(20);
        Node e = new Node(5);
        Node f = new Node(0);
        Node g = new Node(7);
        Node h = new Node(4);
        Node i = new Node(9);
        Node j = new Node(10);

        a.left = b;a.right = c;
        b.left = d;b.right = e;
        c.left=f;c.right=g;
        d.left=h; d.right = i;
        h.right = j;

        //kThLevel(a,2,0);
//        for(int l=0;l<levels(a);l++){
//            kThLevel(a,l,0);
//            System.out.println();
//        }
        System.out.println(printPaths(a,9));
        sumNumbers(a);
        //display(a);
//        System.out.println(sum(a));
//        System.out.println(productOfTree(a));
//        System.out.println(maxValue(a));
//        System.out.println(minValue(a));
//        System.out.println(productNonZeroOfTree(a));
//        System.out.println(levels(a));
        //bfs(a);
        //bfs2(a);
    }

    private static void kThLevel(Node a, int k, int level) {
        if(a ==  null){
            return;
        }
        if(k==level){
            System.out.print(a.val+" ");
            return;
        }

        kThLevel(a.left,k,level+1);
        kThLevel(a.right,k,level+1);


    }

    public static void display(Node root){
        if(root==null){
            return ;
        }
        System.out.print(root.val);
        display(root.left);
        display(root.right);
    }
    public static int length(Node root,int l){
        if(root==null){
            return 0;
        }
        return 1+length(root.left,l)+length(root.right,l);
    }
    public static int sum(Node root){
        if(root==null){
            return 0;
        }


        return root.val+sum(root.left)+sum(root.right);
    }
    public static int productOfTree(Node root){
        if(root==null) return 1;
        return root.val*productOfTree(root.left)*productOfTree(root.right);
    }
    public  static  int maxValue(Node root){
        if(root==null) return Integer.MIN_VALUE;
        return Math.max(root.val,Math.max(maxValue(root.left),maxValue(root.right)));
    }
    public  static  int minValue(Node root){
        if(root==null) return Integer.MAX_VALUE;
        return Math.min(root.val,Math.min(minValue(root.left),minValue(root.right)));
    }
    public static int productNonZeroOfTree(Node root){
        if(root==null) return 1;
        return root.val!=0 ? root.val*productNonZeroOfTree(root.left)*productNonZeroOfTree(root.right) : productNonZeroOfTree(root.left) * productNonZeroOfTree(root.right);
    }
    public static int levels(Node root){
        if(root==null){
            return 0;
        }
        return 1+Math.max(levels(root.left),levels(root.right));
    }

    public static void bfs(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node front = q.remove();
            System.out.println(front.val + " ");
            if(front.left!=null) q.add(front.left);
            if(front.right!=null) q.add(front.right);
        }
        System.out.println();
    }
    public static void bfs2(Node root){
        Queue<Pair> q = new LinkedList<>();
        int currLevel = 0;
        q.add(new Pair(root,0));
        while(!q.isEmpty()){
            Pair p = q.remove();
            if(currLevel<p.level){
                System.out.println();
                currLevel++;
            }
            if(currLevel == p.level){
                System.out.print(p.root.val+" ");
                if(p.root.left!=null) q.add(new Pair(p.root.left,currLevel+1));
                if(p.root.right!=null) q.add(new Pair(p.root.right,currLevel+1));
            }
        }
    }


    public static ArrayList<ArrayList<Integer>> printPaths(Node root, int sum) {
        // code here
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        dfs(root,ans,new ArrayList<>(),sum,0);
        return ans;
    }
    static void dfs(Node root,ArrayList<ArrayList<Integer>> ans,ArrayList<Integer> temp,int sum,int currSum){
        if(root==null || currSum>sum) return ;
        if(sum==currSum){

            ans.add(new ArrayList<>(temp));
            return;
        }
        temp.add(root.val);
        dfs(root.left,ans,temp,sum,currSum+root.val);
        temp.remove(temp.size()-1);
        dfs(root.right,ans,temp,sum,currSum+root.val);

    }

    public static int sumNumbers(Node root) {
        ArrayList<Integer> arr = new ArrayList<>();
        helper(root,arr,"");
        System.out.println(arr);
        return 0;
    }
    public static void helper(Node root,ArrayList<Integer> arr,String s){
        if(root==null)return;
        if(root.left==null && root.right==null){
            System.out.println("sfds");
            s+=root.val;
            arr.add(Integer.parseInt(s));
            return;
        }
        helper(root.left,arr,s+root.val);
        helper(root.right,arr,s+root.val);
    }

    public static Node deleteLeafNode(Node root,int target) {
        if(root.val > target){
            root.left = deleteLeafNode(root.left,target);
        }
        else if(root.val < target){
            root.right = deleteLeafNode(root.right,target);
        }
        else return null;
        return root;
    }




}

