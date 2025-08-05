// import java.util.Scanner;

// public class StackDs {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         Stack mystack = new Stack(size);
//         for(int i = 0; i < size; i++){
//             int val = sc.nextInt();
//             mystack.push(val);
//         }
//         System.out.println("*****************************");
//         for(int i = 0; i < size && !mystack.isEmpty(); i++){
//         int num = mystack.pop();
//         if( num % 2 == 0){
//         //System.out.println("***********************************************");
//         System.out.println(num);
//         // System.out.println("***********************************************");
//         }
//     }
        
//     }
// }
// class Stack{
//     int size;
//     int arr[];
//     int top;
//     Stack(int n){
//         size = n;
//         arr = new int[size];
//         top = -1;
//     }
//     @SuppressWarnings("UnnecessaryReturnStatement")
//     public void push(int val){
//         if(top == size - 1){
//             System.out.println("Stack Overflow");
//             return;
//         }
//         arr[++top] = val;
//     }
//     public int pop(){
//         if(top ==-1){
//             System.out.println("Stack Underflow");
//             return  -1;
//         }
//         return  arr[top--];
//     }
//     public int peek(int val){
//         if(top ==-1){
//             System.out.println("Stack Underflow");
//             return  -1;
//         }
//         return  arr[top];
//     }
//     public boolean isEmpty(){
//         if(top == -1){
//             return true;
//         }
//         return false;
//     }
//     public int size(){
//         return arr[size - top];
//     }
// }
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        Stack mystack = new Stack(size);
        for(int i = 0; i < size; i++){
            String s = sc.next().toLowerCase();
            // if(s.equals("push")){
            //     int val = sc.nextInt();
            //     mystack.push(val);
            //   }
            // if(s.equals("pop")){
            //     System.out.println(mystack.pop());
            // }
            // if(s.equals("top")){
            //     System.out.println(mystack.peek(val));
            // }
            // if(s.equals("size")){
            //     System.out.println(mystack.size());
            // }
            // if(s.equals("isempty")){
            //     System.out.println(mystack.isEmpty());
            // }
            switch(s){
                case "push":
                    int val = sc.nextInt();
                    mystack.push(val);
                    break;
                case "pop":
                    System.out.println(mystack.pop());
                    break;
                case "top":
                    System.out.println(mystack.peek(i));
                    break;
                case "size":
                    System.out.println(mystack.size());
                    break;
                case "isempty":
                    System.out.println(mystack.isEmpty());
                    break;
                default:
                    System.out.println("Input worng");
                    break;    
                    
            }
        }
        
        
    }
}
class Stack{
    int size;
    int arr[];
    int top;
    Stack(int n){
        size = n;
        arr = new int[size];
        top = -1;
    }
    @SuppressWarnings("UnnecessaryReturnStatement")
    public void push(int val){
        if(top == size - 1){
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = val;
    }
    public int pop(){
        if(top ==-1){
            System.out.println("Stack Underflow");
            return  -1;
        }
        return  arr[top--];
    }
    public int peek(int val){
        if(top ==-1){
            System.out.println("Stack Underflow");
            return  -1;
        }
        return  arr[top];
    }
    public boolean isEmpty(){
        if(top == -1){
            return true;
        }
        return false;
    }
    public int size(){
        return arr[size - top];
    }
}
