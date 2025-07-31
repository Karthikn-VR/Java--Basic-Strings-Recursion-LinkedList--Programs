import java.util.*;

public class DoublyLinkedList {
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
                temp.next = nn;
                nn.prev = temp;
                temp = nn;
                
            }
            // nn.next = head;
            // head = nn;
        }

        Node t = head;
        while (t != null) {
            // int n = t.data ;
            // if(n % 2 == 0){
            System.out.print(t.data + " ");
            
            //
           // System.out.print(t.data + " ");
            t = t.next;
        }
    }
}

class Node {
    int data;
    Node next; 
    Node prev;

    Node(int valdata) {
        data = valdata;
        next = null;  
        prev = null;
    }
}
