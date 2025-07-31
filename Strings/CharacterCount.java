import java.util.*;

public class CharacterCount {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        char c = sc.next().charAt(0);
        
        int count = 0;
      
        for(char ch : str.toCharArray()){
            if(ch == c){
                count++;
            
                
            }
        }
        System.out.println(count);
    }
}