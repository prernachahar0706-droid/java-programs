import java.util.Scanner;

public class P19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a and b");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double x = Math.sqrt(a + b) / Math.pow(b, 3) + 3 * a * b;
        System.out.println(x);
        sc.close();
    }
}