import java.util.*;

public class sum_of_even_num_and_multiple_of_odd_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;
        int multiply = 1;
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            } else {
                multiply = multiply * i;
            }
        }
        System.out.print("Sum: ");
        System.out.println(sum);
        System.out.print("multiplication: ");
        System.out.println(multiply);
    }
}
