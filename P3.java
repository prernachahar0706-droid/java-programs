import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the marks");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        double percentage, total;
        total = a + b + c + d + e;
        percentage = total / 500 * 100;
        System.out.println("percentage is" + percentage);
        if (percentage > 70) {
            System.out.println("got admission");
        } else {
            System.out.println("no admission");
        }
        sc.close();
    }
}
