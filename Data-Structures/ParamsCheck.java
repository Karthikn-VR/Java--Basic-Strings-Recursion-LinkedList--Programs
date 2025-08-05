import java.util.*;

public class ParamsCheck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().trim();
        sc.close();
        
        System.out.println(isok(str));
    }      

    public static boolean isok(String str) {
        char[] arr = str.toCharArray();
        StackCustom mystack = new StackCustom(arr.length);

        for (char c : arr) {
            if (c == '(' || c == '{' || c == '[') {
                mystack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (mystack.isEmpty()) return false;
                char open = mystack.pop(); // opening bracket
                if (!match(open, c)) return false; // check pair
            }
        }
        return mystack.isEmpty();
    }

    public static boolean match(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '[' && close == ']') ||
               (open == '{' && close == '}');
    }
}

class StackCustom {
    int size;
    char[] arr;
    int top;

    StackCustom(int n) {
        size = n;
        arr = new char[size];
        top = -1;
    }

    public void push(char c) {
        if (top == size - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = c;
    }

    public char pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return '\0';
        }
        return arr[top--];
    }

    public boolean isEmpty() {
        return top == -1;
    }
}
