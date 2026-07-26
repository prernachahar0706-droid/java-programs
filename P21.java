import java.util.Scanner;

public class P21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a and b");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double x = Math.cbrt((a / b) + 2);
        System.out.println(x);
        sc.close();
    }
}
