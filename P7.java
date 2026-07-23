import java.util.Scanner;

public class P7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks = 0;
        System.out.println("enter the total marks");
        marks = sc.nextInt();
        if (marks > 500) {
            marks = marks + 50;
            System.out.println("you got grace marks" + marks);
        } else {
            System.out.println("well done you dont need grace marks");
        }
        sc.close();
    }
}