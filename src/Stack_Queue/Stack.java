package Stack_Queue;

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

    public static void main(String[] args) {

        StackClass s = new StackClass();

        s.push(4);
        s.push(3);
        s.push(2);
        s.push(1);

        while (!s.isEmpty()){
            System.out.println(s.peep());
            s.pop();
        }
    }
}
