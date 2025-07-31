import java.util.*;

public class LinkedListBeg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node head = null;

        for (int i = 0; i < 5; i++) {
            int val = sc.nextInt();
            Node nn = new Node(val);

          
            nn.next = head;
            head = nn;
        }

        Node t = head;
        while (t != null) {
            System.out.print(t.data + " ");
            t = t.next;
        }
    }
}

class Node {
    int data;
    Node next; 

    Node(int valdata) {
        data = valdata;
        next = null;  
    }
}
