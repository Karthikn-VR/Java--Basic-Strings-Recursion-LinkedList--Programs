import java.util.*;

public class GreatesCommonDivisor {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num2 = sc.nextInt();
        int res = Greatest(num , num2);
        System.out.println(res);
    }
    public static int Greatest(int n , int m){
        int p = Math.min(n,m);
        int max = 0;
        for(int i = 1; i <= p; i++){
            if(n % i == 0 && m % i == 0){
                if(max < i)
                    max = i;
            }
        }
        return max;
    }
}