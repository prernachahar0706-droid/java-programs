import java.util.Scanner;

public class P20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a and b");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double z = Math.sqrt((Math.pow(a, 2) + Math.pow(b, 2)) / Math.pow(b, 2));
        System.out.println(z);
        sc.close();
    }
}
