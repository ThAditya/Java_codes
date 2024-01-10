import java.util.*;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int counter = 0;
        int copy = n;
        while (n > 0) {
            int r = n % 10;
            counter = counter * 10 + r;
            n = n / 10;
        }
        n = copy;
        if (n == counter) {
            System.out.println("it is palindrome");
        } else {
            System.out.println("It is not a palindrome");
        }

    }
}
