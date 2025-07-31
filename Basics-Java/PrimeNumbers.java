import java.util.*;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int count = 0;
        int num = 2;

        while (count < n) {
            if (isPrimeNo(num)) {
                System.out.println(num);
                count++;
            }
            num++;
        }
    }

    public static boolean  isPrimeNo(int num) {
        if (num <= 1) return false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
