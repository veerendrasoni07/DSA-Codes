package stack;

import javax.sound.sampled.ReverbType;
import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
//        System.out.println(st);
        //insertElementAtBottom(st,1265);
        reverseStack(st);
//        System.out.println(st);
        printPattern(423);
    }

    private static void reverseStack(Stack<Integer> st) {

        if(st.isEmpty()){
            return;
        }
        int top = st.pop();
        reverseStack(st);
        insertElementAtBottom(st,top);
    }

    private static void insertElementAtBottom(Stack<Integer> st,int ele) {
        if(st.isEmpty()){
            st.push(ele);
            return;
        }

        int top = st.pop();
        insertElementAtBottom(st,ele);
        st.push(top);
    }

    //pattern question
    public static void printPattern(int number){
        int revNumber = reverseNumber(number);
        while(revNumber!=0){
            int till = revNumber%10;
            for(int i=0;i<till;i++){
                System.out.print("*");
            }
            System.out.println();
            revNumber=revNumber/10;
        }
    }

    public static int reverseNumber(int number){
        int ans = 0;
        while(number!=0){
            ans = ans*10+(number%10);
            number = number/10;
        }
        return ans;
    }



}
