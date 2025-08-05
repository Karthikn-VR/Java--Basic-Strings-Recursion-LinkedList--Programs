import java.util.*;

public class HappyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(happy(num)){
            System.out.println("Happy Number");
        }
        else{
            System.out.println("Not a happy Number");
        }
    }
    public static boolean  happy(int n){
        Set<Integer> set = new HashSet<>();
        while(n != 1 && !set.contains(n)){
            set.add(n);
            int sum = 0;
            while(n > 0){
                int d = n % 10;
                sum += d * d;
                n = n / 10;
            }
            n = sum;
        }
        return n == 1;
    }
}
