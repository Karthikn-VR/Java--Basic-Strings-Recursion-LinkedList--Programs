import java.util.*;

public class LowerCaseCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int number = sc.nextInt();

        StringBuilder arr2 = new StringBuilder();
        for (int i = 0; i < number && i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLowerCase(ch)) {
                arr2.append(ch);
            }
        }

        for (int i = 0; i < arr2.length(); i++) {
            System.out.print(arr2.charAt(i));
        }
        System.out.print(" " + arr2.length());
    }
}