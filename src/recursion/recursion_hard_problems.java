package recursion;
import java.util.*;
public class recursion_hard_problems {

    public static void main(String[] args) {
        //System.out.println(generateAllSubstring("aab"));
        char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };


        //System.out.println(exist(board,"ABCCED"));
        System.out.println(solveNQueens(4));

    }
//
//    public static List<List<String>> generateAllSubstring(String s){
//       List<List<String>> ans = new ArrayList<>();
//        helper(s,0,new ArrayList<String>(),ans);
//        return ans;
//    }
//
//    private static void helper(String s, int i, List<String> s1, List<List<String>> ans) {
//
//        if(i==s.length()){
//            ans.add(new ArrayList<>(s1));
//            return;
//        }
//        helper(s,i+1,s1,ans);
//        for(int ind = i;ind<s.length();ind++){
//            s1.add(s.substring(i,ind+1));
//            System.out.println(s1);
//            helper(s,ind+1,s1,ans);
//            s1.remove(s1.size()-1);
//
//
//        }
//
//
//    }
//
//    public static boolean isPalindrome(String s){
//        int i = 0;
//        int j=s.length()-1;
//        while(i<j){
//            if(s.charAt(i)!=s.charAt(j)){
//                return false;
//            }
//            i++;
//            j--;
//        }
//        return  true;
//    }
//
//
//    public static boolean exist(char[][] board, String word) {
//        int i=0;
//        int j=0;
//        for (int row = i;row<board.length;row++){
//            for (int col = j;col<board[0].length;col++){
//                if(word.charAt(0)==board[i][j]){
//                    i=row;
//                    j=col;
//                    break;
//                }
//            }
//        }
//        return boolHelper(board,i,j,1,word);
//    }
//
//    public  static  boolean boolHelper(char [][]board,int i,int j,int cnt,String word){
//
//
//        if(cnt==word.length()){
//            return true;
//        }
//        char temp = board[i][j];
//        board[i][j]='#';
//        boolean found = boolHelper(board,i+1,j,cnt,word)
//                || boolHelper(board,i,j+1,cnt,word)
//                || boolHelper(board,i-1,j-1,cnt,word)
//                || boolHelper(board,i+1,j+1,cnt,word);
//
//        board[i][j]=temp;
//        if(found) cnt++;
//
//        return found;
//
//    }
//

    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char [][] board = new char[n][n];
        System.out.println(Arrays.deepToString(board));
        return ans;
    }






}
