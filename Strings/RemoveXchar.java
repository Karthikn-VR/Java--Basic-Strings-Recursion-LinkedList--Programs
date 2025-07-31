import java.util.*;

public class RemoveXchar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char letter = sc.next().charAt(0);

       
        StringBuilder arr = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != letter) {
                arr.append(str.charAt(i));
            }
        }

       
        System.out.print(arr.toString());
    }
}