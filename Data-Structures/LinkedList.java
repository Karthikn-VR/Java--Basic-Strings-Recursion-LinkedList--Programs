
import java.util.Scanner;

public class LinkedList{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        Node temp = null;
        for (int i = 0; i < 5; i++) {
            int val = sc.nextInt();
            Node newnode = new Node(val);

            if(head == null){
                head = newnode;
                temp = newnode;
            }
            else{
                temp.next = newnode;
                temp = newnode;
            }
        }
        Node t = head;
        while(t != null){
            System.out.print(t.data + " ");
            t = t.next;
        }
        
    }

}
class Node{
    int data;
    Node next;
    Node(int val){
        data = val;
        next = null;
    }
}