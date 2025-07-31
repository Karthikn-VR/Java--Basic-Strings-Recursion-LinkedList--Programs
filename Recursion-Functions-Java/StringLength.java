import java.util.*;

public class StringLength {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int res = FindLength(str);
        System.out.println(res);
    }
    public static int FindLength(String s){
        char[] arr = s.toCharArray();
        return arr.length;
    }
}