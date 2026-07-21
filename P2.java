import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        System.out.println("enter the number");
        num = sc.nextInt();
        if (num > 500) {
            System.out.println("the number is more");
        } else if (num < 500) {
            System.out.println("the number is less");
        } else {
            System.out.println("the number is equal");
        }
        sc.close();
    }

}
