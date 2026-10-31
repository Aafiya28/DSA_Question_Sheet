package Stack_Queue;

import java.util.ArrayList;

public class Stack {

    static class Node{

        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static class StackClass{

        Node head;

        public boolean isEmpty(){
            return head == null;
        }

        public void push(int data){

            Node newNode = new Node(data);

            if(isEmpty()){
                head = newNode;
                return;
            }

            newNode.next = head;
            head = newNode;
        }

        public int pop(){

            if(isEmpty()){
                System.out.println("Stack Underflow");
                return -1;
            }

            int top = head.data;
            head = head.next;
            return top;
        }

        public int peep(){

            if(isEmpty()){
                return -1;
            }

            return head.data;
        }
    }

    static class StackClassArr{

         ArrayList<Integer> list = new ArrayList<>();

         public boolean isEmpty(){
             return list.size() == 0;
         }

         public void push(int data){
             list.add(data);
         }

         public int pop(){

             if(isEmpty()){
                 return -1;
             }
             int top = list.get(list.size()-1);
             list.remove(list.size()-1);

             return top;
         }

         public int peek(){
             if(isEmpty()){
                 return -1;
             }

             return list.get(list.size()-1);
         }

    }

    public static void main(String[] args) {

        System.out.println("Stack Using LinkedList: ");
        StackClass s = new StackClass();
        s.push(4);
        s.push(3);
        s.push(2);
        s.push(1);

        while (!s.isEmpty()){
            System.out.println(s.peep());
            s.pop();
        }
        System.out.println();

        System.out.println("Stack Using ArrayList: ");

        StackClassArr st = new StackClassArr();
        st.push(7);
        st.push(8);
        st.push(9);
        st.push(10);

        while (!st.isEmpty()){
            System.out.println(st.peek());
            st.pop();
        }

    }
}
