// Write a function to print the sum of all odd numbers from 1 to n.
import java.util.*;
public class odd_sum_function {
    public static int printOddNum(int num) {
        int i, sum = 0;
        for (i = 1; i <= num; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }
        System.out.println("Sum of the odd numbers:" + sum);
        return num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value: ");
        int num = sc.nextInt();
        printOddNum(num);
    }
}