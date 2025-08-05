
import java.util.Scanner;

public class InsertAtBegLL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node head = null;
        Node temp = null;
        for(int i = 0; i< n; i++){
            int val = sc.nextInt();
            Node nn = new Node(val);
        
        if(head == null){
            head = nn;
            temp = nn;
        }
        else{
            if (temp != null) {
            temp.next = head;
}

        }

    }
        int post = sc.nextInt();
        int newval = sc.nextInt();
        head = InertNodeatpos(head , post , newval);
        Node t = head;
        System.out.println("Updated");
        while( t !=  null){
            System.out.print(t.data + " ");
            t = t.next;
        }
    
}
static Node InertNodeatpos(Node head , int pos , int newval ){
    Node newnn = new Node(newval);
    Node curr = head;
    if(pos == 1 ){
      newnn.next = head;
      head = newnn;  
      return  head;  
    }
    
        
        for(int i = 1; i <= pos - 1; i++){
          
          curr = curr.next;
          
        }
        newnn.next = curr.next;
        curr.next = newnn;
        //return head;
    
    return head;
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
