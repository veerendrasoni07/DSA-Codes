package recursion;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class basic_recursion_problems {
    public static void main(String[] args) {
        //printTillN(5);
//        System.out.println(aRaisedToB(2,10));
//        int [] arr = {1,2,30,40,50,26};
//        printArrayElement(arr,0);
//        System.out.println(exits(arr,0,62));
//        System.out.println(PowerSet("abc"));
//        hanoi(3,'A','B','C');
//        Stack<Integer> stack = new Stack<>();
//        stack.add(3);
//        stack.add(1);
//        stack.add(9);
//        stack.add(4);
//        stack.add(10);
//        System.out.println(stack);
//        sortStack(stack);
//        System.out.println(stack);
        int[] nums = {4,4,4,1,4};
        //combinationSum(nums,7);
        //System.out.println(combinationSum2(nums,5));
        System.out.println(subset2(nums));

    }

    private static void hanoi(int n, char a, char b, char c) {
        if(n==0){
            return;
        }
        // move n-1 disk from A to B via C
        hanoi(n-1,a,c,b);
        // move the largest disk from A to C
        System.out.println(a+"-->"+c);
        // move n-1 disk from B to C
        hanoi(n-1,b,a,c);
    }

    private static boolean exits(int[] arr,int idx, int t) {
        if(idx == arr.length){
            return false;
        }
        if(arr[idx]==t){
            return true;
        }
        return exits(arr,idx+1,t);
    }


    public static void printTillN(int n){
        if(n==0){
            return;
        }
        if(n!=1){
            System.out.print(n+" ");
        }
        printTillN(n-1);
        System.out.print(n+" ");

    }

    public static int aRaisedToB(int a ,int b){

        if(b==1){
            return a;
        }
        int call = aRaisedToB(a,(b)/2);
        if(b%2!=0){
            return a*call*call;
        }
        else return call*call;
    }


    public static void printArrayElement(int [] arr,int i){
        if(arr.length == i){
            return;
        }
        printArrayElement(arr,i+1);
        System.out.println(arr[i]);
    }


    public static ArrayList<ArrayList<String>> PowerSet(String s){
        ArrayList<ArrayList<String>> ans = new ArrayList<>();
        storePowerSet(s,0,ans,"");
        return ans;
    }

    public  static  void storePowerSet(String s,int i,ArrayList<ArrayList<String>> ans,String temp){
        if(i==s.length() ){
            ArrayList<String> tempArray = new ArrayList<>();
            tempArray.add(temp);
            ans.add(tempArray);
            return;
        }

        temp += s.charAt(i);
        storePowerSet(s,i+1,ans,temp);
        temp = s.substring(0,temp.length()-1);
        storePowerSet(s,i+1,ans,temp);

    }

    public static void sortStack(Stack<Integer> stack){
        if(!stack.isEmpty()){
            int temp = stack.pop();
            sortStack(stack);
            insertElementToTheStack(stack,temp);
        }
    }

    private static void insertElementToTheStack(Stack<Integer> stack, int temp) {
        if(stack.isEmpty() || stack.peek() <= temp){
            stack.push(temp);
            return;
        }
        int a = stack.pop();
        insertElementToTheStack(stack,temp);
        stack.push(a);
    }

//    public static void printSubsequenceSumOfTarget(int [] nums,int target){
//        ArrayList<Integer> ds = new ArrayList<>();
//        helper(nums,ds,0,0,target);
//    }
//
//    private static void helper(int[] nums, ArrayList<Integer> ds, int sum, int i, int target) {
//        if(nums.length == i){
//            if(sum==target){
//                System.out.println(ds);
//                return;
//            }
//            return;
//        }
//        if(sum==target){
//            System.out.println(ds);
//            return;
//        }
//
//        //pick
//        ds.add(nums[i]);
//        sum+=nums[i];
//        helper(nums,ds,sum,i+1,target);
//        //not pick
//        ds.remove(ds.size()-1);
//        sum-=nums[i];
//        helper(nums,ds,sum,i+1,target);
//    }

//
    public static void printOneSubsequenceSumOfTarget(int [] nums,int target){
        ArrayList<Integer> ds = new ArrayList<>();
        helperForOneSubsequence(nums,ds,0,0,target);
    }

    private static boolean helperForOneSubsequence(int[] nums, ArrayList<Integer> ds, int sum, int i, int target) {
        if(nums.length == i){
            if(sum==target){
                System.out.println(ds);
                return true;
            }
            return false;
        }
        if(sum==target){
            System.out.println(ds);
            return true;
        }

        //pick
        ds.add(nums[i]);
        sum+=nums[i];
        if(helperForOneSubsequence(nums, ds, sum, i + 1, target)) return true;
        //not pick
        ds.remove(ds.size()-1);
        sum-=nums[i];
        if(helperForOneSubsequence(nums, ds, sum, i + 1, target)) return true;
        return false;
    }

    // count total subsequence
//    public static void CountSubsequenceSumOfTarget(int [] nums,int target){
//        ArrayList<Integer> ds = new ArrayList<>();
//        System.out.println(helperForCountSubsequence(nums,0,0,target));
//    }
//
//    private static int helperForCountSubsequence(int[] nums,  int sum, int i, int target) {
//        if(nums.length == i){
//            if(sum==target){
//                return 1;
//            }
//            return 0;
//        }
//        if(sum==target){
//
//            return 1;
//        }
//
//        //pick
//        sum+=nums[i];
//        int left = helperForCountSubsequence(nums,sum,i+1,target);
//        sum-=nums[i];
//        int right = helperForCountSubsequence(nums,sum,i+1,target);
//        return  left+right;
//    }


//    public static void combinationSum(int [] nums,int k){
//        List<List<Integer>> ans = new ArrayList<>();
//        List<Integer> ds = new ArrayList<>();
//        helper(nums,0,0,ans,ds,k);
//        System.out.println(ans);
//    }
//
//    private static void helper(int[] nums, int sum, int i, List<List<Integer>> ans, List<Integer> ds, int k) {
//
//        if(i== nums.length){
//            if(sum==k){
//                ans.add(new ArrayList<>(ds));
//                return;
//            }
//            return;
//        }
//        if(sum==k){
//            ans.add(new ArrayList<>(ds));
//            return;
//        }
//
//        //pick
//        sum+=nums[i];
//        while(sum+nums[i]<k){
//            sum+=nums[i];
//            ds.add(nums[i]);
//        }
//        helper(nums,sum,i+1,ans,ds,k);
//
//        //not pick
//        sum-=nums[i];
//        helper(nums,sum,i+1,ans,ds,k);
//    }



//    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
//        Arrays.sort(candidates);
//
//        List<Integer> temp = new ArrayList<>();
//        List<List<Integer>> ans = new ArrayList<>();
//        helper(candidates,0,target,ans,temp);
//
//        return ans;
//    }
//
//    public static void helper(int [] arr,int i,int target,List<List<Integer>> ans,List<Integer> temp){
//
//        if( i==arr.length || arr[i]>target ){
//            if(target==0){
//                ans.add(new ArrayList<>(temp));
//            }
//            return;
//        }
//
//        if(target==0){
//            ans.add(new ArrayList<>(temp));
//            return;
//        }
//
//        //pick
//        if(arr[i]<=target){
//            temp.add(arr[i]);
//            helper(arr,i+1,target-arr[i],ans,temp);
//            temp.remove(temp.size()-1);
//        }
//        for(int j=i;j<arr.length;j++){
//            if(arr[j]==arr[j-1]){
//                continue;
//            }
//            helper(arr,j+1,target,ans,temp);
//        }
//
//    }


    public static List<List<Integer>> subset2(int [] arr){
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();
        helper(arr,0,ans,new ArrayList<>());
        return  ans;
    }

    private static void helper(int[] arr, int i, List<List<Integer>> ans,ArrayList<Integer> temp) {
        if(i==arr.length){
            System.out.println("Base Case"+temp);
            ans.add(new ArrayList<>(temp));
            return;
        }


        for(int ind=i;ind<arr.length;ind++){
            if(ind>i && arr[ind]==arr[ind-1]){
                continue;
            }
            temp.add(arr[ind]);
            helper(arr,ind+1,ans,temp);

            temp.remove(temp.size()-1);

        }
        ans.add(new ArrayList<>(temp));


    }


}

/*
*
* now what about -ve exponential
*  2^-3 = 1/2*2*2
* a = 2 , b = 3
*
* 2^3 = 2*2*2
*
* b=8 -> 2^8 == 2^4 * 2^4 == 2^2 * 2^2 == 2^1 * 2^1
*
* 9 ==> 9
* +1/2 = 5
*
* 2^9 == 2^4 * 2^4 == 2^2 * 2^2 == 2^1 * 2^1
*
*
* */



