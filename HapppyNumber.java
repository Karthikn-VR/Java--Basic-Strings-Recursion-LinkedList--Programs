import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HapppyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(isHappy(n)){
            System.out.println("Happy Number");
        }
        else{
            System.out.println("Not A happy Number");
        }
        
    }
    public static boolean  isHappy(int n){
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
