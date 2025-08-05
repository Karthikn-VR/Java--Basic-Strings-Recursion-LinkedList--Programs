import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Scanner;

public class DequeClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deque <Integer> dq = new ArrayDeque<>();
        dq.addFirst(10);
        dq.add(5);
        System.out.println(dq);
        PriorityQueue <Integer> pq = new PriorityQueue<>();
        pq.offer(10);
        pq.offer(5);
        System.out.println(pq);
        
    }
    
}
