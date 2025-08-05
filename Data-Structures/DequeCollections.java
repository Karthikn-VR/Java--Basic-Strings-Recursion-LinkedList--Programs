import java.util.*;
import java.util.LinkedList;
import java.util.Queue;

public class DequeCollections {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int capacity = sc.nextInt(); // Queue capacity
        Queue<String> queue = new LinkedList<>();
        int n = sc.nextInt(); // Number of operations

        for (int i = 0; i < n; i++) {
            String command = sc.next().trim().toUpperCase();
            switch (command) {
                case "ENQUEUE":
                    String name = sc.next();
                    if (queue.size() == capacity) {
                        System.out.println("Queue is full. Cannot add " + name);
                    } else {
                        queue.add(name);
                    }
                    break;

                case "DEQUEUE":
                    if (queue.isEmpty()) {
                        System.out.println("Served Customer: Queue is empty. No customer to serve.");
                    } else {
                        System.out.println("Served Customer: " + queue.poll());
                    }
                    break;

                case "DISPLAY":
                    if (queue.isEmpty()) {
                        System.out.println("Queue is empty.");
                    } else {
                        System.out.print("Current Queue: ");
                        for (String customer : queue) {
                            System.out.print(customer + " ");
                        }
                        System.out.println();
                    }
                    break;

                default:
                    System.out.println("Invalid command.");
            }
        }
        sc.close();
    }
}

//  for (int j = 0; j < q.size() - 1; j++) {
//                         q.add(q.poll());
//                     }