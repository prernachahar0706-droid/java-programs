import java.util.Scanner;

public class P17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a,b,c");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double x = -b + Math.sqrt(Math.pow(b, 2) + 4 * a * c) / 2 * a;
        System.out.println("x" + x);
        sc.close();
    }
}