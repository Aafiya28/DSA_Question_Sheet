package Stack_Queue;

import java.util.Stack;

public class StackClass {

    //Task : Push at Bottom of the Stack
    static void pushAtBottom(int data, Stack<Integer> s){

        if(s.isEmpty()){
            s.push(data);
            return;
        }

        int top = s.pop();
        pushAtBottom(data, s);
        s.push(top);
    }

    //Task : Reverse Stack
    static void reverse(Stack<Integer> s){

        if(s.isEmpty()){
            return;
        }

        int top = s.pop();
        reverse(s);
        pushAtBottom(top, s);
    }

    public static void main(String[] args) {

        Stack<Integer> stk = new Stack();

        stk.push(1);
        stk.push(2);
        stk.push(3);
        stk.push(4);


        //Task : Push at Bottom of the Stack
//        System.out.println("After pushing 5 at the Bottom: ");
//        pushAtBottom(5, stk);
//        while (!stk.isEmpty()){
//            System.out.println(stk.peek());
//            stk.pop();
//        }
//        System.out.println();

        System.out.println("After Reversing the Stack: ");
        //Task : Reverse Stack
        reverse(stk);

        while (!stk.isEmpty()){
            System.out.println(stk.peek());
            stk.pop();
        }
    }
}
