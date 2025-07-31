import java.util.LinkedList;
import java.util.Scanner;

public class RemoveAtSpecificPos {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n == 0){
            System.out.println("List is empty");
            return;
        }
        LinkedList<Integer> ids = new LinkedList<>();
        for(int i = 0; i < n; i++){
            ids.add(sc.nextInt());
        }
        int del = sc.nextInt();
        if(del > n){
            System.out.println("List is empty");
            return;
        }
        else{
            ids.remove(del - 1);
        }
        for(int nums : ids){
            System.out.print(nums + " ");
        }
        
    }
}