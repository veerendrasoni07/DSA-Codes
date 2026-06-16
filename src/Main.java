import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Veerendra");
//         Pattern 1
//        for(int i=0;i<4;i++){
//            for(int j=0;j<4;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //Pattern 2

//        for(int i=0;i<5;i++){
//            for(int j=0;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //Pattern 3

//        for(int i=1;i<=5;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }


        // Pattern 4
//
//        for(int i=1;i<=5;i++){
//            for (int j=1;j<=i;j++){
//                System.out.print(i);
//            }
//            System.out.println();
//        }

        // Pattern 5

//        for(int i=4;i>=1;i--){
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // Pattern 6
//        for (int i=5;i>=1;i--){
//            for (int j=1;j<=i;j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }

        // Pattern 7
//        int n = 4;
//        for (int i=0;i<n;i++){
//            for (int j=n-i-1;j>0;j--){
//                System.out.print(" ");
//            }
//            for (int k=0;k<2*i+1;k++){
//                System.out.print("*");
//            }
//            for (int j=n-i-1;j>0;j--){
//                System.out.print(" ");
//            }
//            System.out.println();
//        }

        // Pattern 8
//        int n=5;
//        for(int i=0;i<n;i++){
//            for (int j=0;j<i;j++){
//                System.out.print(" ");
//            }
//            for (int k=2*n-(2*i+1);k>0;k--){
//                System.out.print("*");
//            }
//            for (int j=0;j<i;j++){
//                System.out.print(" ");
//            }
//            System.out.println();
//        }


        // Pattern 9
//        int n = 5;
//        for (int i =0;i<n;i++){
//            for (int j=0;j<n-i-1;j++){
//                System.out.print(" ");
//            }
//            for (int k = 0;k<2*i+1;k++){
//                System.out.print("*");
//            }
//            for (int j=0;j<n-i-1;j++){
//                System.out.print(" ");
//            }
//            System.out.println();
//        }
//        for (int i = 0;i<n;i++){
//            for (int j = 0; j<i;j++){
//                System.out.print(" ");
//            }
//            for (int j = 0;j<2*n-(2*i+1);j++){
//                System.out.print("*");
//            }
//            for (int j = 0; j<i;j++){
//                System.out.print(" ");
//            }
//            System.out.println();
//        }


        // Pattern 10
//        int n=5;
//        for(int i=1;i<=2*n-1;i++){
//            if(i>n){
//                for(int j=1;j<=2*n-i;j++){
//                    System.out.print("*");
//                }
//            }
//            else{
//                for(int j=1;j<=i;j++){
//                    System.out.print("*");
//                }
//            }
//            System.out.println();
//        }


        // Pattern 11
//        int n = 5;
//        int start = 1;
//        for(int i=0;i<n;i++){
//            if(i%2==0) start =1;
//            else start = 0;
//            for (int j=0;j<=i;j++){
//                System.out.print(start);
//                start = 1-start;
//            }
//            System.out.println();
//        }


        // Pattern 12
//        int n = 4;
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print(j);
//            }
//            for(int j=1;j<=2*(n-i);j++){
//                System.out.print(" ");
//            }
//            for (int j=i;j>=1;j--){
//                System.out.print(j);
//            }
//            System.out.println();
//        }


        // Pattern 13
//        int n = 5;int num = 1;
//        for(int i=1;i<=n;i++){
//
//            for(int j=1;j<=i;j++){
//                System.out.print(num+" ");
//                num+=1;
//            }
//            System.out.println();
//        }

        // Pattern 14
//        int ascii_value = 65;
//        int n = 5;
//        for (int i=0;i<n;i++){
//            for(int j=0;j<n-i;j++){
//                char alpha = (char) (ascii_value+j);
//                System.out.print(alpha);
//            }
//            System.out.println();
//        }

        // Pattern 15
//        int ascii = 65;
//        int n = 5;
//        for(int i=0;i<n;i++){
//            for(int j=0;j<=i;j++){
//                char alpha = (char) (ascii+i);
//                System.out.print(alpha);
//            }
//            System.out.println();
//        }

        // Pattern 16
//        int n=5;
//        for(int i=0;i<n;i++){
//            for(int j=0;j<n-i-1;j++){
//                System.out.print(" ");
//            }
//            char alpha = 'A';
//            for(int j=0;j<2*i+1;j++){
//                System.out.print(alpha);
//                if(j<i){
//                    alpha++;
//                }
//                else alpha--;
//
//            }
//            System.out.println();
//        }

        // Pattern 17  // 5-1-0 = 4 = E (LOOP 1) || 5-1-1 = 3 = D (LOOP 2) || 4 = E (LOOP 2) || 5-1-2 = 2 = C (LOOP 3) || 3=D (LOOP 3) || 4=E (LOOP 3) || 5-3-1 = 1 = B
//        int n=5;
//        int ascii = 65;
//
//        for (int i=0;i<n;i++){
//            for(int j=n-1-i;j<(n);j++){
//                char alpha = (char) (ascii+j);
//                System.out.print(alpha);
//            }
//            System.out.println();
//        }


        // Pattern 18
//        int n=5;
//        for(int i=0;i<n;i++){
//            for(int j=0;j<=n-i-1;j++){
//                System.out.print("*");
//            }
//            for (int j=0;j<2*i;j++){
//                System.out.print(" ");
//            }
//            for(int j=0;j<=n-i-1;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for(int i=0;i<n;i++){
//            for(int j=0;j<=i;j++){
//                System.out.print("*");
//            }
//            for(int j=0;j<2*n-2*i-2;j++){  // 8 || 6 || 4 || 2
//                System.out.print(" ");
//            }
//            for(int j=0;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }



        // Pattern 19
//        int n = 5;
//        for(int i=0;i<2*n-1;i++){
//            if (i<n){
//                for(int j=0;j<=i;j++){
//                    System.out.print("*"+" ");
//                }
//                for(int j=0;j<2*n-2*i-2;j++){
//                    System.out.print("  ");
//                }
//                for(int j=0;j<=i;j++){
//                    System.out.print("*"+" ");
//                }
//            }
//            else {
//                for (int j=0;j<2*n-i-1;j++){
//                    System.out.print("*"+" ");
//                }
//                for(int j = 0 ; j<2*i-2*n+2;j++){ // 10-10+2 = 2 || 12-10+2 = 4 || 14-10+2 = 6 || 16-10+2 = 8
//                    System.out.print("  ");
//                }
//                for (int j = 0 ; j<2*n-i-1;j++){ // 10-5-1 = 4 || 10-6-1 = 3 || 10-7-1 = 2 || 10-8-1 = 1
//                    System.out.print("*"+" ");
//                }
//            }
//            System.out.println();
//        }
//        int [] arr1 = {1,2,3,4,5,5,6,9,12,14,4656345};
//        int [] arr2  = {1,1,2,2,3,3,5,8,8};
//        int [] arr3 = {3,2,3};
//        int [] arr4 = {1,1,1,0,0,1,1,0,1,1};
//        int [] arr5 = {0};
//        int [] arr6 = {1,2,-3,-1,-1};
//        int [] arr7 = {1,2,3};
//        int [] arr8 = {4,3,2,5,3,1,9,6,3,3,80,70,60,10};
//        int [][] arr9 = {
//                {0,1},
////                {1,0,1,1},
////                {1,1,0,1},
////                {0,1,1,1}
//        };
//        int [][] arr10 = {
//                {1,2},
//                {4,5},
//
//        };
//        int [] arr1 = {1,2};
//        int [] arr2 = {-2,-1};
//        int [] arr3 = {-1,2};
//        int [] arr4 = {0,2};
//        int [] xorArray = {1,4,2,3,4};


         //System.out.println(largestElement(arr,0));
        //System.out.println(secLargestElement(arr,0));
        //System.out.println(Arrays.toString(rotateAnArray(arr)));
        //System.out.println(Arrays.toString(moveZero(arr)));
        //System.out.println(linearSearch(arr,10));
        //unionOfArray(arr,arr2);
//        singleNumber(arr2);
//        longestSubArrayWithSumK(arr3,5);
//        System.out.println(longestSubarray(arr3,5));
        //findMaxLength(arr4);
        //System.out.println(Arrays.deepToString(arr9));
//        addToArrayForm(arr5,34);
//        findMaxSum(arr6);
//        mergeArray(arr7,arr8);
//        sumDiaMat(arr9);
//        mulMat(arr9,arr10);
//        majorityElement(arr3);
//        nextPermutation(arr8);
        //leaderInAnArray(arr8);
//        setZeroes(arr9);
//        rotateMatrix(arr10);
        //spiralMat(5);
        //pascalTriangleElement(5,1);
        //pascalTriangleRow(5);
        //pascalTriangle(5);
        //majorityElement2(arr3);
//        int num = 13 & 7;
//        System.out.println(num);
//        FourSumII(arr1, arr2, arr3, arr4);
//        countXor(xorArray,6);
//        int [][] arr = {{1,3},{2,6},{8,10},{15,18}};
//        mergeSubIntervals(arr);
//        countInversion(xorArray);
//        reversePair(xorArray);
//        findMissingAndRepeating(xorArray);
//        int [] arr1 = {-5,-2,4,5};
//        int [] arr2 = {-3,1,8};
//        mergeTwoSortedArray(arr1,arr2,arr1.length, arr2.length);
//        maxProduct(arr2);
//        int [] weights = {1,2,3,4,5,6,7,8,9,10};
//        int ans = shipWithinDays(weights,5);
//        System.out.println(ans);
        int [] arr1 = {1,7,11};
        int [] arr2 = {1,5,2,10,3};
        sort(arr2,0, arr2.length-1);
        //priorityQueueProblem(arr1,arr2,3);
        String s = "ab";
        String t = "aa";
        //removeVovels("race a car");
        //countValidSelections(arr2);

        //missingNumber(arr,2);
    }


    public static void sort(int [] arr,int low,int high){

        if(low>=high){
            return;
        }

        // divide from 0 to left
        int mid = (low+high)/2;

        sort(arr,low,mid);
        sort(arr,mid+1,high);
        merge(arr,low,mid,high,new ArrayList<>());
        System.out.println(Arrays.toString(arr));
    }

    public static  void merge(int [] arr,int low,int mid,int high,ArrayList<Integer> temp){
        int left = low;
        int right = mid+1;
        while(left<=mid && right <= high){
            if(arr[left]<=arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                right++;
            }
        }
        while (left<=mid){
            temp.add(arr[left]);
            left++;
        }
        while (right<high){
            temp.add(arr[right]);
            right++;
        }

        for(int i=low;i<=high;i++){
            arr[i] = temp.get(i-low);
        }


    }


//    public static int largestElement(int[] arr,int i){
//        int n = arr.length;
//        int max = arr[0];
//         for (int j=0;j<n;j++){
//             if(arr[j]>max){
//                 max = arr[j];
//             }
//         }
//         return max;
//
//    }

//    public static int secLargestElement(int[] arr,int i){
//        int n = arr.length;
//        int max = arr[0];
//        int sec_lar = arr[0];
//        for (int j=0;j<n;j++){
//            if(arr[j]>max){
//                max = arr[j];
//            }
//        }
//        for(int k=0;k<n;k++){
//            if(arr[k]>sec_lar && arr[k]<max){
//                sec_lar = arr[k];
//            }
//        }
//        return sec_lar;
//
//    }
//
//
//
//    public static int [] rotateAnArray(int arr[]){
//        int n = arr.length;
//        int i = 0;int j = i+1;
//        while(j<=n-1){
//            int temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
//            i++;
//            j++;
//        }
//        return arr;
//    }
//
//    public static int [] moveZero(int arr[]){
//        int n = arr.length;
//        int index = -1;
//        for(int k=0;k<n-1;k++){
//            if(arr[k]==0){
//                index = k;
//                break;
//            }
//        }
//        if(index==-1) return new int[]{0};
//        int i = index;int j = i+1;
//        while(j<=n-1){
//            if(arr[i]==0 && arr[j]==0){
//                j++;
//            }
//            else if(arr[i]==0 && arr[j]!=0 || arr[i]!=0 && arr[j]==0){
//                int temp = arr[i];
//                arr[i] = arr[j];
//                arr[j] = temp;
//                i++;
//                j++;
//            }
//        }
//        return arr;
//    }
//
//
//    public static int linearSearch(int arr[],int t){
//        int n = arr.length;
//        for(int i = 0; i<=n-1;i++){
//            if(arr[i]==t){
//                return i;
//            }
//        }
//        return -1;
//    }


//    public static void unionOfArray(int [] arr1, int [] arr2){
//        int n = arr1.length;
//        int m = arr2.length;
//        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
//        ArrayList<Integer> temp = new ArrayList<>();
//        for (int i=0;i<n;i++){
//            hashMap.put(arr1[i],hashMap.getOrDefault(arr1[i],0)+1);
//        }
//
//        for (int i=0;i<m;i++){
//            hashMap.put(arr2[i],hashMap.getOrDefault(arr1[i],0)+1);
//        }
//
//        for (int it : hashMap.keySet() ) {
//            temp.add(it);
//        }
//
//
//        System.out.println(hashMap);


        // optimal solution
//        int i = 0;
//        int j = 0;
//        while (i<n && j<m){
//            if(arr1[i]<=arr2[j]){
//                if(temp.isEmpty() || arr1[i]!= temp.get(temp.size()-1)){
//                    temp.add(arr1[i]);
//                }
//                i++;
//            }
//            else {
//                if(temp.isEmpty() || arr2[j]!= temp.get(temp.size()-1)){
//                    temp.add(arr2[j]);
//                }
//                j++;
//            }
//        }
//        while (i<n){
//            if(arr1[i]!= temp.get(temp.size()-1)){
//                temp.add(arr1[i]);
//            }
//            i++;
//        }
//        while (j<m){
//            if(arr1[j]!= temp.get(temp.size()-1)){
//                temp.add(arr2[j]);
//            }
//            j++;
//        }
//
//        System.out.println(temp);
//    }

//    public static void singleNumber(int[] nums) {
//        int n = nums.length;
//        HashMap<Integer,Integer> hashmap = new HashMap<>();
//        for(int i=0;i<n;i++){
//            hashmap.put(nums[i],hashmap.getOrDefault(nums[i],0)+1);
//        }
//        for(Map.Entry<Integer,Integer> entry : hashmap.entrySet()){
//            if(entry.getValue()==1){
//                n = entry.getKey();
//            }
//        }
//        System.out.println(hashmap);
//        System.out.println(n);
//    }
//
//    public static void longestSubArrayWithSumK(int []arr,int k){
//        int n = arr.length;
//        int cnt = 0;
//        for(int i=0;i<n;i++){
//            int sum = 0;
//            for(int j=i;j<n;j++){
//                sum+=arr[j];
//                if(sum==k){
//                    cnt++;
//                    break;
//                }
//            }
//        }
//        System.out.println(cnt);
//    }
//
//    public static int longestSubarray(int[] arr, int k) {
//        // code here
//        int n = arr.length;
//        int len = 0;
//        int left = 0;
//        int right = 0;
//        int sum = arr[0];
//        while(right<n-1){
//            while(left<=right && sum>k ){
//                sum-=arr[left];
//                left++;
//            }
//            if(sum==k){
//                len = Math.max(len,right-left+1);
//            }
//            right++;
//            sum+=arr[right];
//        }
//        return len;
//
//    }
//    public static void findMaxLength(int[] nums) {
//        int cnt1=0;
//        int newcnt1=0;                ##   W R O N G    A P P R O R O A C H
//        int newcnt0=0;
//        int cnt0=0;
//        int n = nums.length;
//        //cnt total number of 1
//        for (int i=0;i<n;i++){
//            if(nums[i]==1){
//                cnt1++;
//                newcnt1=Math.max(cnt1,newcnt1);
//            }
//            else {
//                cnt1=0;
//            }
//        }
//        System.out.println(newcnt1);
//        for(int i = 0;i<n;i++){
//            if(nums[i]==0){
//                cnt0++;
//                newcnt0=Math.max(cnt0,newcnt0);
//            }
//            else{
//                cnt0 = 0;
//            }
//        }
//        System.out.println(newcnt0);
//        if(newcnt1>newcnt0){
//            while (newcnt1>newcnt0){
//                newcnt1--;
//            }
//        }
//        else{
//            while (newcnt0>newcnt1){
//                newcnt0--;
//            }
//        }
//        System.out.println(newcnt1);
//        System.out.println(newcnt0);
//    }
//    public static void reverseArray(int [] arr){
//        int n = arr.length;
//        for(int i=0;i<n/2;i++){
//            int temp = arr[n-i-1];
//            arr[n-i-1]=arr[i];
//            arr[i]=temp;
//        }
//        System.out.println(Arrays.toString(arr));
//    }
//    public static void addToArrayForm(int[] num, int k) {
//        LinkedList<Integer> temp = new LinkedList<>();
//        int n = num.length;
//        int carry = 0;
//        for (int i=n-1;i>=0;i--){
//            int sum = num[i]+k%10+carry;// sum =  4 + 1 + 0 = 5 --> sum = 7 + 8 + 0 = 15
//            temp.addFirst(sum%10);
//            carry = sum/10;
//            k=k/10;
//        }
//        if(carry!=0){
//            temp.addFirst(carry);
//        }
//        System.out.println(temp);
//    }
//
//
//
//    public static void findMaxSum(int []arr){
//        int maxi = 0;
//        int curSum = 0;
//        int n = arr.length;
//        for(int i=0;i<n;i++){
//            curSum += arr[i];
//            if(curSum<0){
//                curSum=0;
//            }
//            maxi=Math.max(curSum,maxi);
//
//        }
//        System.out.println(maxi);
//    }
//
//    public static void mergeArray(int[]arr1,int[]arr2){
//        int n1 = arr1.length;
//        int n2 = arr2.length;
//        int [] res = new int[n1+n2];
//        for(int i=0;i<n1;i++){
//            res[i]=arr1[i];
//        }
//        for(int i=0;i<n2;i++){
//            res[n1+i]=arr2[i];
//        }
//        System.out.println(Arrays.toString(res));
//
//    }
//
//    public static void sumDiaMat(int[][]arr){
//        int n = arr.length;
//        int sum = 0;
//        for(int i=0;i<n;i++){
//            sum += arr[i][i];
//        }
//        System.out.println(sum);
//    }
//
//
//    public static void mulMat(int [][] arr1,int [][]arr2){
//        int n1=arr1.length;
//        int n2 =arr2[0].length;
//        int n3 = arr2.length;
//        int [][] res = new int[n1][n2];
//        int sum=0;
//        for(int i=0;i<n1;i++){
//            for(int j=0;j<n1;j++){
//                for(int k=0;k<n3;k++){
//                    sum+=arr1[i][k]*arr2[k][j];
//                }
//                res[i][j]=sum;
//                sum=0;
//            }
//        }
//        System.out.println(Arrays.deepToString(res));
//
//
//    }
//    public static void majorityElement(int [] arr){
//        int n = arr.length;
//        HashMap<Integer,Integer> hash = new HashMap<>();
//        for(int i=0;i<n;i++){
//            if(hash.containsKey(arr[i])){
//                hash.put(arr[i],hash.getOrDefault(arr[i],0)+1);
//            }
//            else hash.put(arr[i],1);
//        }
//        for (Map.Entry<Integer,Integer> entry : hash.entrySet() ){
//            if(entry.getValue()>n/2){
//                System.out.println(entry.getKey());
//                return;
//            }
//        }
//        System.out.println(hash);
//    }




//    public static  void nextPermutation(int [] arr){
//        int n = arr.length;
//        int ind = -1;
//        // first task is to find out the break point
//        for(int i=n-2;i>=0;i--){
//            if(arr[i]<arr[i+1]){
//                ind = i;
//                break;
//            }
//        }
//
//        if(ind==-1){
//            reverseArray(arr);
//        }
//
//        for(int i=n-1;i>ind;i--){
//            if(arr[i]>arr[ind]){
//                int temp = arr[i];
//                arr[i] = arr[ind];
//                arr[ind] = temp;
//                break;
//            }
//        }

        // reverse the array from the ind+1 to n-1 so that we get closest next permutation
//        int left = ind+1;
//        int right = n-1;
//        while(left<right){
//            int temp = arr[left];
//            arr[left] = arr[right];
//            arr[right] = temp;
//            left++;
//            right--;
//        }
//        System.out.println(Arrays.toString(arr));
//
//
//    }


//    public static void leaderInAnArray(int []arr){
//        int n = arr.length;
//        ArrayList<Integer> temp = new ArrayList<>();
//        for(int i=0;i<n;i++){
//            boolean leader = true;
//            for(int j=i+1;j<n;j++){
//                if(arr[i]<arr[j]){
//                    leader = false;
//                    break;
//                }
//            }if(leader) temp.add(arr[i]);
//
//        }
//        int max = 0;
//        HashSet<Integer> hashSet = new HashSet<>();
//        for(int i=0;i<n;i++){
//            hashSet.add(arr[i]);
//        }
//        System.out.println(hashSet);
//    }

//    public static void setZeroes(int[][] matrix) {
//        int n = matrix.length;
//        int m = matrix[0].length;
//        int col0=1;
//        for(int i=0;i<n;i++){
//            for(int j=0;j<m;j++){
//                if(matrix[0][0]==0){
//                    col0=0;
//                }else if(matrix[i][j]==0 && j!=0){
//                    matrix[0][j]=0;
//                    matrix[i][0]=0;
//                }
//                else if(j==0 && matrix[i][j]==0){
//                    col0=0;
//                }
//            }
//        }
//        System.out.println(col0);
//        System.out.println(Arrays.deepToString(matrix));
//        // now go from the 1st row and 1st column
//        for(int i=1;i<n;i++){
//            for(int j=1;j<m;j++){
//                if(matrix[0][j] ==0 || matrix[i][0]==0){
//                    matrix[i][j]=0;
//                }
//            }
//        }
//        System.out.println(Arrays.deepToString(matrix));
//
//        if(matrix[0][0]==0){
//            for(int i=0;i<m;i++){
//                matrix[0][i] = 0;
//            }
//        }
//        if(col0==0){
//            for(int j=0;j<n;j++){
//                matrix[j][0]=0;
//            }
//        }
//
//
//    }
//
//
//
//    public static void rotateMatrix(int [][]mat){
//        int n = mat.length;
//        int m = mat[0].length;
//        System.out.println(Arrays.deepToString(mat));
//        // finding the transpose without any extra space
//        for(int i=0;i<n-1;i++){
//            for(int j=i+1;j<m;j++){
//                int temp = mat[i][j];
//                mat[i][j] = mat[j][i];
//                mat[j][i]=temp;
//            }
//        }
//        System.out.println(Arrays.deepToString(mat));
//        for(int i=0;i<n;i++){
//            for(int j=0;j<m/2;j++){
//                int temp = mat[i][j];
//                mat[i][j]=mat[i][m-1-j];
//                mat[i][m-1-j] = temp;
//            }
//        }
//        System.out.println(Arrays.deepToString(mat));
//
//    }
//
//
//    public static void spiralMat(int n){
//        int [][] arr = new int[n][n];
//        int num =1;
//        int left = 0;
//        int top =0;
//        int right = n-1;
//        int bottom = n-1;
//        while(left<=right && top<=bottom){
//            for(int i=left ;i<=right;i++){
//                arr[top][i]=num;
//                num++;
//            }
//            top++;
//            for(int i=top;i<=bottom;i++){
//                arr[i][right]=num;
//                num++;
//            }
//            right--;
//            for(int i = right ;i>=left;i--){
//                arr[bottom][i] = num;
//                num++;
//            }
//            bottom--;
//            for(int i = bottom;i>=top;i--){
//                arr[i][left] = num;
//                num++;
//            }
//            left++;
//        }
//        System.out.println(Arrays.deepToString(arr));
//
//     }


//     public static int pascalTriangleElement(int row,int col){
//        int res = 1;
//        row = row-1;
//        col = col -1;
//        for(int i=0;i<col;i++){
//            res = res*(row-i);
//            res = res/(i+1);
//        }
//        return res;
//     }
//    public static ArrayList<Integer> pascalTriangleRow(int row){
//        int res = 1;
//        ArrayList<Integer> temp = new ArrayList<>();
//        temp.add(res);
        // Brute Force Approach
//        for (int i=1;i<=row;i++){
//            res = pascalTriangleElement(row,i);
//            temp.add(res);
//        }
//
        // optimal
//        for(int i=1;i<row;i++){
//            res = res*(row-i);
//            res = res/i;
//            temp.add(res);
//        }
//        return temp;
//    }

//
//    public static void pascalTriangle(int n){
//        ArrayList<List<Integer>> ans = new ArrayList<>();
//        // Brute
/// /        for(int row=1;row<=n;row++){
/// /            ArrayList<Integer> temp = new ArrayList<>();
/// /            for(int col = 1;col<=row;col++){
/// /                temp.add(pascalTriangleElement(row,col));
/// /            }
/// /            ans.add(temp);
/// /        }
//
//        //Optimal
//        for(int row=1;row<=n;row++){
//            ans.add(pascalTriangleRow(row));
//        }
//
//        System.out.println(ans);
//    }
//
//    public static void majorityElement2(int []arr){
//        int n = arr.length;
//        int el = -1;
//        int cnt1 = 0;
//        HashMap<Integer,Integer> hash = new HashMap<>();
//        ArrayList<Integer> ans = new ArrayList<>();
//        for(int i=0;i<n;i++){
//            hash.put(arr[i],hash.getOrDefault(arr[i],0)+1);
//        }
//        for(Map.Entry<Integer,Integer> entry : hash.entrySet()){
//            if(entry.getValue()>n/3){
//                ans.add(entry.getKey());
//            }
//        }
//        System.out.println(hash);
//        System.out.println(ans);
//        //System.out.println(el);
//        //System.out.println(cnt1);
//
//    }
//
//
//    public static void FourSumII(int []arr1,int []arr2,int []arr3,int []arr4){
//        int n = arr1.length;
//        int cnt = 0;
//        HashSet<Integer> st =new HashSet<>();
//        for(int i=0;i<n;i++){
//            for(int j=0;j<n;j++){
//                int sum = -(arr3[i]+arr4[j]);
//                st.add(sum);
//            }
//        }
//        System.out.println(st);
//        for(int i=0;i<n;i++){
//            for(int j=0;j<n;j++){
//                int sum = arr1[i]+arr2[j];
//                if(st.contains(sum)){
//                    cnt++;
//                }
//            }
//        }
//
//
//        System.out.printf("Total number of tuples:%d",cnt);
//    }
//
//    public static void largestSubWithSumZero(int [] arr){
//        int n = arr.length;
//        int maxLen = 0;
//        for(int i=0;i<n;i++){
//            int sum = arr[i];
//            for(int j=i+1;j<n;j++){
//                sum += arr[j];
//                if(sum==0){
//                    maxLen = Math.max(maxLen,j-i+1);
//                }
//            }
//        }
//        System.out.println(maxLen);
//    }

//    public static  void countXor(int [] arr,int k){
//        int n = arr.length;
//        int cnt = 0;
//        int xor = 0;
//        HashMap<Integer,Integer> hashMap = new HashMap<>();
//        hashMap.put(0,1);
//        for(int i=0;i<n;i++){
//            xor = xor ^ arr[i];
//            int x = xor ^ k;
//            if(hashMap.containsKey(x)){
//                cnt += hashMap.get(x);
//            }
//            hashMap.put(xor,hashMap.getOrDefault(xor,0)+1);
//        }
//        System.out.println(cnt);
//    }

//
//    public static void mergeSubIntervals (int[][] arr){
//        int n = arr.length;
//        Arrays.sort(arr, new Comparator<int[]>() {
//            @Override
//            public int compare(int[] a, int[] b) {
//                return a[0]-b[0];
//            }
//        });
//        System.out.println(Arrays.deepToString(arr));
//        ArrayList<List<Integer>> ans = new ArrayList<>();
//        ans.add(Arrays.asList(arr[0][0],arr[0][1]));
//        for(int i=1;i<n;i++){
//            int fIndex = arr[i][0];
//            int endIndex = arr[i][1];
//            if(ans.get(ans.size()-1).get(1)<=endIndex && ans.get(ans.size()-1).get(1)>fIndex){
//                ans.get(ans.size()-1).set(1,Math.max(ans.get(ans.size()-1).get(1),endIndex));
//            }
//            else{
//                ans.add(Arrays.asList(fIndex,endIndex));
//            }
//        }
//        System.out.println(ans);
//    }

//    public static int merge(int [] arr,int low,int mid,int high){
//        int left = low;
//        int right = mid+1;
//        int cnt = 0;
//        ArrayList<Integer> temp = new ArrayList<>();
//        while(left<= mid && right<=high){
//            if(arr[left]<=arr[right]){
//                temp.add(arr[left]);
//                left++;
//            }
//            else{
//                if(arr[left]>arr[right]*2){
//                    cnt+=(mid-left)+1;
//                }
//                temp.add(arr[right]);
//                right++;
//            }
//        }
//
//        while (left<=mid){
//            temp.add(arr[left]);
//            left++;
//        }
//        while(right<=high){
//            temp.add(arr[right]);
//            right++;
//        }
//        for(int i=low;i<=high;i++){
//            arr[i] = temp.get(i-low);
//        }
//        return cnt;
//    }
//    public static int mergeSort(int []arr,int low,int high){
//        int cnt = 0;
//        if(low>=high){
//            return cnt;
//        }
//        int mid = (low+high)/2;
//        cnt+=mergeSort(arr,low,mid);
//        cnt+=mergeSort(arr,mid+1,high);
//        cnt+=merge(arr,low,mid,high);
//        return cnt;
//    }
//    public static void countInversion(int []arr){
//        System.out.println(mergeSort(arr,0,arr.length-1));
//        System.out.println(Arrays.toString(arr));
//    }

//    public static void reversePair(int [] arr){
//        System.out.println(mergeSort(arr,0, arr.length-1));
//    }


//    public static void findMissingAndRepeating(int []arr){
//        int n = arr.length;
//        ArrayList<Integer> ans = new ArrayList<>();
//        int Sn = (n*(n+1))/2; //15
//        int S2n = (n*(n+1)*(2*n+1))/6; // 55
//        int Sa = 0;
//        int S2an = 0;
//        for(int i=0;i<n;i++) {
//            Sa += arr[i]; //1,4,2,5,4 --> 16
//            S2an += arr[i] * arr[i]; // 62
//        }
//        int eqOneVal = Sa-Sn; // x-y = k
//        System.out.println(eqOneVal);
//        int eqTwoVal = S2an - S2n; // x2-y2 = z --> (x-y)(x+y)=z --> (x+y) = z/(x-y);
//        eqTwoVal = eqTwoVal/eqOneVal; // x+y = z
//        System.out.println(eqTwoVal);
//        int y = (eqTwoVal-eqOneVal)/2; // x+y-(x-y) = z-k --> x+y-x+y = z-k --> 2y = z-k --> y = (z-k)/2;
//        int x = (eqTwoVal-y);
//        ans.add(x);
//        ans.add(y);
//        System.out.println(ans);
//
//    }

//    public static void mergeTwoSortedArray(int [] arr1,int [] arr2 , int m , int n){
//        int i = m-1;
//        int j = 0;
//        while(i>=0 && j<n){
//            if(arr1[i]>=arr2[j]){
//                int temp = arr1[i];
//                arr1[i]=arr2[j];
//                arr2[j]=temp;
//                i--;
//                j++;
//            }
//            else{
//                i--;
//            }
//        }
//        System.out.println(Arrays.toString(arr1));
//        System.out.println(Arrays.toString(arr2));
//        Arrays.sort(arr1);
//        Arrays.sort(arr2);
//        System.out.println(Arrays.toString(arr1));
//        System.out.println(Arrays.toString(arr2));
//
//    }


//    public static void maxProduct(int [] nums){
//        int n = nums.length;
//        int pro = 1;
//        int maxPro = 0;
//        for(int i=0;i<n;i++){
//            for(int j=i;j<n;j++){
//                pro *= nums[j];
//                maxPro = Math.max(maxPro,pro);
//            }
//            pro = 1;
//        }
//        System.out.println(maxPro);
//    }

//
//public static int sumOfArray(int [] arr){
//    int n = arr.length;
//    int sum = 0;
//    for(int i=0;i<n;i++){
//        sum+=arr[i];
//    }
//    return sum;
//}
//    public static int maxElement(int arr[]){
//        int n = arr.length;
//        int maxi = Integer.MIN_VALUE;
//        for(int i=0;i<n;i++){
//            maxi = Math.max(maxi,arr[i]);
//        }
//        return maxi;
//    }
//    public static int weightFindOutFunction(int []arr,int weight){
//        int n = arr.length;
//        int i = 0;
//        int sum = 0;
//        int day = 0;
//        while(i<n){
//
//            if(sum+arr[i]>weight){
//                day++;
//                sum=0;
//            }
//            else {
//                sum+=arr[i];
//                i++;
//            }
//        }
//        if(sum>0) day++;
//        System.out.println(day);
//        return day;
//    }
//    public static int shipWithinDays(int[] weights, int days) {
//        int min = maxElement(weights);
//        int max = sumOfArray(weights);
//        for(int i = min;i<max;i++){
//            if(weightFindOutFunction(weights,i)<=days){
//                return i;
//            }
//        }
//        return -1;
//
//    }

//    public static void missingNumber(int [] arr,int k){
//        int n = arr.length;
//        int num = 1;
//        int i = 0;
//        while(i<n && k>0){
//            if(num==arr[i]){
//                i++;
//            }
//            else{
//                k--;
//            }
//            num++;
//        }
//        System.out.println(num);
//    }

//public static class Pair{
//    int sum;
//    int first;
//    int second;
//    Pair(int sum,int first,int second){
//        this.sum = sum;
//        this.first = first;
//        this.second = second;
//    }
//}
//    public static void priorityQueueProblem(int[] arr1, int[] arr2, int k){
//        int n = arr1.length;
//        int m = arr2.length;
//        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->Integer.compare(a.sum,b.sum));
//        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
//        for(int i=0;i<n;i++){
//            for(int j=0;j<n;j++){
//                int sum = arr1[i]+arr2[j];
//                Pair p1 = new Pair(sum,arr1[i],arr2[j]);
//                pq.add(p1);
//            }
//        }
//
//        for(int i=0;i<k;i++){
//
//            Pair ts = pq.poll();
//            int first = ts.first;
//            int second = ts.second;
//            ArrayList<Integer> temp =new ArrayList<>();
//            temp.add(first);
//            temp.add(second);
//            ans.add(temp);
//        }
//        System.out.println(Arrays.deepToString(ans.toArray()));
//    }

//    public static void isIsomorphic(String s, String t){
//        HashMap<Character,Character> hs = new HashMap<>();
//        int n = s.length();
//        int m = s.length();
//
//        for(int i=0;i<n;i++){
//            if(!hs.containsKey(s.charAt(i)) && !hs.containsValue(t.charAt(i))){
//                hs.put(s.charAt(i),t.charAt(i));
//            }
//
//        }
//
//        String ans = "";
//        for(int i = 0;i<m;i++){
//            if(hs.containsKey(s.charAt(i))) ans += hs.get(s.charAt(i));
//        }
//        if(ans.equals(t)) {
//            System.out.println("True");
//            return;
//        }
//        System.out.println("False");
//        System.out.println(hs);
//
//
//
//    }


//    public static void removeVovels(String s){
//        String ans = "";
//        int n = s.length();
//        HashSet<Character> set = new HashSet<>();
//        set.add('a');
//        set.add('e');
//        set.add('i');
//        set.add('o');
//        set.add('u');
//        set.add('A');
//        set.add('E');
//        set.add('I');
//        set.add('O');
//        set.add('U');
//
//        char [] ch = s.toCharArray();
//        int i=0;
//        int j=n-1;
//        while(i<=j){
//            if(!set.contains(ch[i]) || ch[i]==' '){
//                i++;
//            }
//            if(!set.contains(ch[j]) || ch[i] == ' '){
//                j--;
//            }
//            if(set.contains(ch[i]) && set.contains(ch[j])){
//                char temp = ch[i];
//                ch[i] = ch[j];
//                ch[j] = temp;
//                i++;
//                j--;
//            }
//        }
//        for(char c :ch){
//            ans +=c;
//        }
//        System.out.println(ans);
//    }
//public static int prefixSum(int[] nums,int i){
//    int sum = 0;
//    for(int j=0;j<i;j++){
//        sum+=nums[j];
//    }
//
//    return sum;
//}
//    public static int suffixSum(int[] nums,int i){
//        int sum = 0;
//        for(int j=nums.length-1;i<j;j--){
//            sum+=nums[j];
//        }
//        return sum;
//    }
//    public static void countValidSelections(int[] nums) {
//        int cnt = 0;
//        int n = nums.length;
//        int i = 0;
//        while (i < n) {
//            if (nums[i] != 0) {
//                i++;
//            } else {
//                int prefix = prefixSum(nums, i);
//                int suffix = suffixSum(nums, i);
//                System.out.println(prefix);
//                System.out.println(suffix);
//                int diff = Math.abs(suffix - prefix);
//                if (diff == 0) {
//                    cnt += 2;
//                    i++;
//                } else if (diff == 1) {
//                    cnt += 1;
//                    i++;
//                } else {
//                    i++;
//                }
//            }
//        }
//        System.out.println(cnt);
//    }










}