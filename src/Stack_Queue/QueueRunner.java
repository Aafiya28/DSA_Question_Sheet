package Stack_Queue;

public class QueueRunner {

    int[] arr;
    static int size;
    static int rear = -1;

    QueueRunner(int n){
        arr = new int[n];
        this.size = n;
    }

    static boolean isEmpty(){
        return rear == -1;
    }

    //Enqueue - O(1).
    public void add(int data){
        if(rear == size-1){
            System.out.println("Queue Full!");
            return;
        }

        rear++;
        arr[rear] = data;
    }

    //Dequeue - O(N).
    public int remove(){
        if(isEmpty()){
            System.out.println("Queue is Empty!");
            return -1;
        }

        int front = arr[0];
        for(int i=0; i<rear; i++){
            arr[i] = arr[i+1];
        }

        rear--;
        return front;
    }
}
