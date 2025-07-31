import java.util.*;
class Addition {
    public static void main(String[] args) {
        int a;
        int b;
        try (Scanner sc = new Scanner(System.in)) {
            a = sc.nextInt();
            b = sc.nextInt();
        }
        System.out.printf("The addition of %d and %d is %d",a,b,a+b );
        
    }
    
}
