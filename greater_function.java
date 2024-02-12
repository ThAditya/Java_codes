
// Write a function which takes in 2 numbers and returns the greater of those
// two.
import java.util.*;

public class greater_function {
    public static int greaterNumberFunction(int a, int b) {
        if (a > b) {
            System.out.println("a is greater than b");
        } else if (a == b) {
            System.out.println("both are equal");
        } else {
            System.out.println("b is greater than a");
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of a: ");
        int a = sc.nextInt();
        System.out.println("Enter the values of b: ");
        int b = sc.nextInt();
        greaterNumberFunction(a, b);
    }
}
