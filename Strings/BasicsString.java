import java.util.*;
public class BasicsString {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char Character = sc.next("Enter a String").charAt(3); //printing 3rd character
        System.out.println(Character);
        sc.close();
    }
    
}
