import java.util.*;

public class factorial {
    public static int calculatefactorial(int n) {
        if (n <= 0) {
            System.out.println("invalid number");
            return n;
        }
        int factorial = 1;
        for (int i = n; i >= 1; i--) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
        return factorial;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        calculatefactorial(n);
    }
}
