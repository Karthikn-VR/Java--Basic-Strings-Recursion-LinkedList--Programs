
import java.util.*;

public class PowerOfNumbers {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int res = (int)Math.pow(2,number);
        System.out.println(res);
    }
}