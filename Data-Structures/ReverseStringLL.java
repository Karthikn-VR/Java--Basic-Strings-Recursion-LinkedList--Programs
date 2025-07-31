import java.util.LinkedList;
import java.util.Scanner;

public class ReverseStringLL {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        LinkedList<String> ids = new LinkedList<>();
        for(int i = 0; i < n; i++){
            ids.add(sc.nextLine());
        }
        for(int i = n-1 ; i >= 0; i--){
            System.out.print(ids.get(i) + " ");
        }
    }
}