import java.util.Scanner;

public class P15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c, d;
        System.out.println("enter the value of a and b");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = a + b;
        d = Math.pow(c, 2);
        System.out.println("x= " + d);
        sc.close();
    }
}