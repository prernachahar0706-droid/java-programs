import java.util.Scanner;

public class P16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double l, g, x;
        System.out.println("enter the value of l and g");
        l = sc.nextDouble();
        g = sc.nextDouble();
        x = 2 * 3.14 * Math.sqrt(l / g);
        System.out.println("x=" + x);
        sc.close();
    }
}
