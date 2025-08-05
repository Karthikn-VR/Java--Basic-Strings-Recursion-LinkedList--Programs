import java.util.*;
import java.util.LinkedList;
import java.util.Queue;

public class QueueCollections {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        Queue<Integer> q = new LinkedList<>();
        for (int idx = 0; idx < size; idx++) {
            q.offer(sc.nextInt());
        }
        while(!q.isEmpty()){
            System.out.println(q.poll());

        }
    }
    }

