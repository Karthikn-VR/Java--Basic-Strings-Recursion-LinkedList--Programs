
import java.util.*;


public class QueueDs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        Queue q = new Queue(size);
        for(int i = 0; i < size; i++){
            int val = sc.nextInt();
            q.offer(val);
        }
        System.out.println("*****************");
        for(int i = 0; i < q.size(); i++){
            int val = q.poll();
            if(val % 2 == 0){
                System.out.println(val);
            }
        }
   




       
    }
}

class Queue {
    int size;
    int front;
    int rear;
    int[] arr;

    public Queue(int size) {
        this.size = size;
        arr = new int[size];
        front = 0;
        rear = -1;
    }

 
    public void offer(int data) {
        if (rear == size - 1) {
            System.out.println("Overflow");
            return;
        }
        arr[++rear] = data;
        
    }

   
    public int poll() {
        if (front > rear) {
            System.out.println("Underflow");
            return -1;
        }
        return arr[front++];
    }

   
    public int peek() {
        if (front > rear) {
            System.out.println("Underflow");
            return -1;
        }
        return arr[front];
    }

 
    public int size() {
        return rear - front + 1;
    }

    
}
