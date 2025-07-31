import java.util.*;

public class CountingBits {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int res = SumOnes(num);
        System.out.println(res);
        
    }
    public static int SumOnes(int num){
        String numbers = Integer.toBinaryString(num);
        char[] arr = numbers.toCharArray();
        int sum = 0;
        for(char word: arr){
            if(word == '1' ){
                sum += 1;
            }
        }
        return sum;
    }
}