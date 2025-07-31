import java.util.LinkedList;
import java.util.Scanner;

public class SwapElementsLL {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> ids = new LinkedList<>();
        int n = sc.nextInt();
        for(int i = 0;i < n; i++){
            ids.add(sc.nextInt());
        }
        int swapIndex = sc.nextInt();
        int s1 = ids.get(swapIndex - 1);
        int s2 = ids.get(ids.size() - swapIndex);
        int index1 = ids.size() - swapIndex;
        ids.set(index1 , s1);
        ids.set(swapIndex - 1, s2);
        
        for(int nums: ids){
            System.out.print(nums + " ");
        }
    }
}