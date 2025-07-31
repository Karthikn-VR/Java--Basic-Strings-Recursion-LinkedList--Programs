import java.util.*;
import java.util.LinkedList;

public class LinkedListBuiltIn {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> ids = new LinkedList<>();
        int n = sc.nextInt();
        for(int i = 0; i < n ; i++){
            int val = sc.nextInt();
            ids.add(val);
        }
        int index = sc.nextInt();
        int newval = sc.nextInt();
        ids.add(index - 1,newval);
        for(int i = 0; i < ids.size(); i++){
            System.out.print(ids.get(i)+" ");
        }
    }
}
    

