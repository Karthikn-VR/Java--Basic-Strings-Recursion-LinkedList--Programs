import java.util.*;

public class StudentFormList {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String Name = sc.next();
        int Age = sc.nextInt();
        float cgpa = sc.nextFloat();
        char grade = sc.next().charAt(0);
        StudentForm(Name,Age,cgpa,grade);
    }
    public static void StudentForm(String Name, int Age, float cgpa , char grade){
        float cgpaa =  (float)((int)(cgpa * 100)) / 100;
        System.out.println("Name:"+" "+Name);
        System.out.println("Age:"+" "+Age);
        System.out.printf("CGPA: %.2f%n" ,cgpaa);
        System.out.println("Grade:"+" "+grade);
        
    }
}