import java.util.Scanner;

public class P9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salary = 0;
        System.out.println("enter the salary");
        salary = sc.nextInt();
        if (salary > 9000) {
            double it = 0.12 * salary;
            double hra = 0.08 * salary;
            double da = 0.08 * salary;
            double ma = 0.09 * salary;
            double pv;
            pv = 0.05 * salary;
            double deduction = it + pv;
            System.out.println("deduction" + deduction);
            double gross = (da + hra + ma) - deduction;
            double netsalary = salary + gross;
            System.out.println("netsalary=" + netsalary);

        } else {
            double it = (0.12 / 100) * salary;
            double hra = (0.10 / 100) * salary;
            double da = (0.06 / 100) * salary;
            double ma = (0.12 / 100) * salary;
            double pv = (0.05 / 100) * salary;
            double deduction = it + pv;
            double gross = da + hra + ma - deduction;
            double netsalary1 = salary + gross;
            System.out.println("netsalary=" + netsalary1);
        }
        sc.close();
    }

}
