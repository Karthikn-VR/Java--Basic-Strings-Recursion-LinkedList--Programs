import java.util.*;

public class  WelcomeName {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String Name = sc.next();
        Greet(Name);
        
    }
    public static void Greet(String name){
        System.out.println("Welcome" + " " + name);
    }
}