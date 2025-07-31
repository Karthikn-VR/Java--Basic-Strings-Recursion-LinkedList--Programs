import java.util.*;
import java.util.LinkedList;

public class DeleteLL {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        LinkedList<Integer> ids = new LinkedList<>();
        for(int i = 0; i < n; i++){
            ids.add(sc.nextInt());
        }
        int del = sc.nextInt();
        if(n <= del){
            System.out.println("List is empty");
            return;
        
        }
        else{
            ids = new LinkedList<>(ids.subList(0 , ids.size() - del));
        }
        if(!ids.isEmpty()){
            for(int nums : ids){
                System.out.print(nums + " ");
            }
        }
        else{
            System.out.println("List is empty");
        }
        
    }
}