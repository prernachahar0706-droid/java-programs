import java.util.Scanner;

public class P8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the basic salary");
        double basicsalary = sc.nextDouble();
        if (basicsalary < 2000) {
            double bonus = 500;
            double netsalary = basicsalary + bonus;
            System.out.println("the net salary=" + netsalary);
        } else {
            System.out.println("the net salary=" + basicsalary);
        }
        sc.close();
    }
}