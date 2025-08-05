import java.util.*;

public class DoublyLinkedList {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        Node temp = null;

      
        for (int i = 0; i < 4; i++) {
            int val = sc.nextInt();
            Node nn = new Node(val);

            if (head == null) {
                head = nn;
                temp = nn;
            } else {
                if (temp != null) { 
                    temp.next = nn;
                    nn.prev = temp;
                }
                temp = nn;
            }

        }

        sc.close();

        
        System.out.print("Forward: ");
        Node t = head;
        Node tail = null; 
        while (t != null) {
            System.out.print(t.data + " ");
            tail = t; 
            t = t.next;
        }

       
        System.out.print("\nBackward: ");
        while (tail != null) {
            System.out.print(tail.data + " ");
            tail = tail.prev;
        }
    }
}

class Node {
    int data;
    Node next;
    Node prev;

    Node(int val) {
        data = val;
        next = null;
        prev = null;
    }
}
