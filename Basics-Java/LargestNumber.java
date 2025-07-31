import java.util.*;
class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int[] arr = {a , b , c};
        Arrays.sort(arr);
        System.out.println("The largest is " + arr[2]);
        System.out.println("The Second Largest is " + arr[1]);
        int sum = arr[1] + arr[2];
        System.out.println("The Addition of 2 largest in arr is: " + sum );
        int sum2 = arr[0] + arr[1];
        System.out.println("The Addition of 2 Smallest in arr is: " + sum2 );
        
    }
}
