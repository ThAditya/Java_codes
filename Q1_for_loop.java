import java.util.Scanner;

public class Q1_for_loop {
    public static void main(String[] args) {
        // for (int i = 0; i <= 10; i++) {

        // System.out.print(i);
        // }

        // // Q2:- for loop by taking input from user

        Scanner sc = new Scanner(System.in);
        // // int n = sc.nextInt();
        // // for (int i = 0; i <= n; i++) {
        // // System.out.println(i);
        // // }

        // // Q3:- print number from A to B

        // int a = sc.nextInt();
        // int b = sc.nextInt();

        // for (int i = a; i <= b; i++) {
        // System.out.println(i);
        // }
        int x = sc.nextInt();
        int y = sc.nextInt();
        int sum = 0;
        int multiply = 1;

        for (int j = x; j <= y; j++) {
            if (j % 2 == 0) {
                sum = sum + j;
            } else {
                multiply = multiply * j;
            }
        }
        System.out.println(sum);
        System.out.println(multiply);
    }
}