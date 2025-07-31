
import java.util.Scanner;

class AbsoluteNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String c =  a.replace("-", "");
        
        System.out.println(String.valueOf(c));
        int number = Integer.parseInt(c); 
        if(number % 5 == 0 && number % 11 == 0 ){
        System.out.println("Divisible by 5 and 11");
       }
       else{
        System.out.println("Not Divible by 5 and 11");
       }
    
    }
    
}
