import java.util.*;

public class CalculatingFactorials {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int res = factorial(num);
        System.out.println(res);
        sc.close();
    }
    public static int factorial(int n){
        if(n == 1) return 1;
        else
        return n * factorial(n - 1);
    }

}