import java.util.Scanner;

public class P10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the current and previous reading");
        double cr = sc.nextDouble();
        double pr = sc.nextDouble();
        double consumed_unit = cr - pr;
        System.out.println("consumed unit is=" + consumed_unit);
        if (consumed_unit < 400) {
            System.out.println("amount=" + consumed_unit * 1.30);
        } else {
            System.out.println("amount=" + consumed_unit * 2.50);
        }
        sc.close();
    }
}