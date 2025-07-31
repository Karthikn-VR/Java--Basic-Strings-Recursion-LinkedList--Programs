import java.util.*;

public class ClaculatingTotalNumbers {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int res = SumOfNumbers(num);
        System.out.println(res);
    }
    public static int SumOfNumbers(int n){
        if(n == 1) return 1;
        else return n + SumOfNumbers( n - 1);
    }
}