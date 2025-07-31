
import java.util.Scanner;

class Bonus {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int num = sc.nextInt();
     int sal = sc.nextInt();
     double bonus = sal;
     if(num >= 5){
          bonus = sal + sal*( 5.0 / 100);
          System.out.println("Your Bonus" + bonus);
     }
     else{
        System.out.println("no bonus");
     }
 }    
}
