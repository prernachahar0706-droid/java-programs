import java.util.Scanner;

public class P18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the v alue of a and b");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double x = Math.sqrt(Math.pow(a, 3) / b) + 2 * a * b;
        System.out.println("x" + x);
        sc.close();
    }
}