import java.util.Scanner;

public class P5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int math = 0, science = 0;
        System.out.println("enter the marks of math and science");
        math = sc.nextInt();
        science = sc.nextInt();
        if (math > 60 && science > 60) {
            System.out.println("eligible");
        } else {
            System.out.println("not eligible");
        }
        sc.close();
    }

}
