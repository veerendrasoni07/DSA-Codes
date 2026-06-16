package stack;



class myStack{
    int [] arr;
    int size = 0;
    myStack(int n){
         arr = new int[n];
    }
    int top = -1;

    int stackSize(){
        return size;
    }
    void push(int num) throws Exception{
        if(size==arr.length) throw new Exception("Stack is full");
        arr[++top] = num;
        size++;
    }

    int peek() throws Exception{
        if(size==0) throw  new Exception("Stack is already empty");
        return arr[top];
    }

    int pop() throws  Exception{
        if(size==0) throw  new Exception("Stack is already empty");
        int ele = arr[top];
        arr[top] = 0;
        size--;
        top--;
        return ele;
    }







}


public class arraytostackimplementation {
    public static void main(String[] args) throws  Exception {
        myStack st = new myStack(5);
        st.push(5);
        st.push(10);
        System.out.println(st.pop());
        st.push(15);
        st.push(30);
        st.push(45);
        st.push(100);

        System.out.println(st.stackSize());
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());




    }
}
