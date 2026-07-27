import java.util.Scanner;

public class P22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, a, b, c;
        System.out.println("enter '1' to find out greatest number by logical operator ");
        System.out.println("enter '2' to find out greatest number by nested if");
        System.out.println("enter '3' to check the digits of the entered number");
        x = sc.nextInt();
        switch (x) {
            case 1: {
                System.out.println("enter the value of a, b, c");
                a = sc.nextInt();
                b = sc.nextInt();
                c = sc.nextInt();
                if (a > b && a > c) {
                    System.out.println("a is greatest");
                } else if (b > a && b > c) {
                    System.out.println("b is greatest");
                } else {
                    System.out.println("c is greatest");
                }
                break;
            }
            case 2: {
                System.out.println("enter the value of a, b, c");
                a = sc.nextInt();
                b = sc.nextInt();
                c = sc.nextInt();
                if (a > b) {
                    if (a > c) {
                        System.out.println("a is greatest");
                    } else {
                        System.out.println("c is greatest");
                    }
                } else if (b > c) {
                    System.out.println("b is greatest");
                } else {
                    System.out.println("c is greatest");
                }
                break;

            }
            case 3:
                System.out.println("enter the number");
                a = sc.nextInt();
                if (a < 10) {
                    System.out.println("the number is of 1 digits");
                } else if (a >= 10 && a < 100) {
                    System.out.println("the number is of 2 digits");
                } else if (a >= 100 && a < 1000) {
                    System.out.println("the number is of 3 digits");
                } else {
                    System.out.println("the number is of multiple digits");
                }
                break;
            default: {
                System.out.println("invalid number");
            }

        }
        sc.close();
    }

}