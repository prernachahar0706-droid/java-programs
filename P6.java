import java.util.Scanner;

public class P6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.println("enter the number");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if (a > b) {
            if (a > c) {
                System.out.println("a is greater");
            } else {
                System.out.println("c is grater");
            }
        } else if (b > c) {
            System.out.println("b is greater");
        } else {
            System.out.println("c is grater");
        }
        sc.close();
    }
}