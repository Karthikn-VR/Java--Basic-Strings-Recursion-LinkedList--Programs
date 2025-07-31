import java.util.*;

public class FibonacciSequence {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int res = fib(number);
        System.out.println(res);
    }
    public static int fib(int n){
        if(n  <= 1){
            return n;
        }
       return fib(n - 1) + fib(n - 2 );
    }
}